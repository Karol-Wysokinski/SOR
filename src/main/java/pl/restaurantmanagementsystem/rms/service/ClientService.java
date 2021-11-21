package pl.restaurantmanagementsystem.rms.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.restaurantmanagementsystem.rms.entity.food.FoodEntity;
import pl.restaurantmanagementsystem.rms.entity.order.OrderEntity;
import pl.restaurantmanagementsystem.rms.model.FoodDto;
import pl.restaurantmanagementsystem.rms.model.OrderDto;
import pl.restaurantmanagementsystem.rms.model.OrderStatus;
import pl.restaurantmanagementsystem.rms.modelIn.FoodIn;
import pl.restaurantmanagementsystem.rms.modelOut.FoodOut;
import pl.restaurantmanagementsystem.rms.repository.FoodRepository;
import pl.restaurantmanagementsystem.rms.repository.OrderRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClientService {

    private OrderRepository orderRepository;
    private FoodRepository foodRepository;

    public String placeOrder(OrderDto orderDto) throws Exception {

        validateOrderDto(orderDto);

        List<FoodEntity> foodEntities = orderDto.getFoodInList()
                .stream()
                .map(e -> foodRepository.getByMenuId(e.getMenuItem()))
                .collect(Collectors.toList());

        String orderId = UUID.randomUUID().toString();
        orderRepository.save(new OrderEntity(orderId, OrderStatus.IN_PREPARATION, foodEntities));

        return orderId;
    }

    public List<FoodOut> getMenu() {
        return foodRepository
                .findAll()
                .stream()
                .map(FoodEntity::toFoodOut)
                .collect(Collectors.toList());
    }

    public OrderStatus getOrderStatus(String orderId) {
        return orderRepository.findByOrderId(orderId).map(OrderEntity::getOrderStatus).orElse(OrderStatus.NOT_EXISTS);
    }


    private void validateOrderDto(OrderDto orderDto) throws Exception {
        if (orderDto.getFoodInList().isEmpty()) {
            throw new Exception("Received order is empty");
        }

        List<Integer> orderIds = orderDto.getFoodInList().stream()
                .map(FoodIn::getMenuItem)
                .collect(Collectors.toList());

        boolean isOrderValid = foodRepository
                .findAll()
                .stream()
                .map(FoodEntity::toDto)
                .map(FoodDto::getMenuId)
                .collect(Collectors.toList())
                .containsAll(orderIds);

        if (!isOrderValid) {
            throw new Exception("Order is not valid");
        }
    }
}