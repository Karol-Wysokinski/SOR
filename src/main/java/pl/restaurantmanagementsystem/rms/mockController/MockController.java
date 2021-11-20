package pl.restaurantmanagementsystem.rms.mockController;

import org.springframework.web.bind.annotation.*;
import pl.restaurantmanagementsystem.rms.model.OrderDto;
import pl.restaurantmanagementsystem.rms.model.OrderStatus;
import pl.restaurantmanagementsystem.rms.modelOut.FoodOut;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1")
public class MockController {
    @PostMapping("/order")
    public String placeOrder(@RequestBody OrderDto orderDto) {
        System.out.println(orderDto);
        return UUID.randomUUID().toString();
    }

    @GetMapping("/order/status")
    public String getOrderStatus(String orderId) {
        return OrderStatus.IN_PREPARATION.getMessageTemplate();
    }

    @GetMapping("/menu")
    public List<FoodOut> getMenu() {
        return List.of(
                new FoodOut(1, "Margarita", "Pizza", "Ser,sos pomidorowy", 20, "bez miesa"),
                new FoodOut(2, "Peperoni", "Pizza", "Ser,peperoni,sos pomidorowy", 20, "bez miesa"),
                new FoodOut(3, "Capriciosa", "Pizza", "Ser,pieczarki, sos pomidorowy", 20, "bez miesa"),
                new FoodOut(4, "Hawajska", "Pizza", "Ser,szynka, ananas, sos pomidorowy", 20, "bez miesa")
        );
    }
}
