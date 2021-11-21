package pl.restaurantmanagementsystem.rms.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.restaurantmanagementsystem.rms.entity.order.OrderEntity;
import pl.restaurantmanagementsystem.rms.model.OrderStatus;
import pl.restaurantmanagementsystem.rms.modelOut.OrderChefOut;
import pl.restaurantmanagementsystem.rms.repository.OrderRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ChefService {


    private OrderRepository orderRepository;

    public List<OrderChefOut> getOrderList() {
        return orderRepository
                .findAll()
                .stream()
                .filter(e->e.getOrderStatus().equals(OrderStatus.IN_PREPARATION))
                .map(OrderEntity::toOrderChefOut)
                .collect(Collectors.toList());
    }
}
