package pl.restaurantmanagementsystem.rms.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.restaurantmanagementsystem.rms.model.OrderDto;
import pl.restaurantmanagementsystem.rms.model.OrderStatus;
import pl.restaurantmanagementsystem.rms.modelOut.FoodOut;
import pl.restaurantmanagementsystem.rms.service.ClientService;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/client")
public class ClientOrderController {

    private ClientService clientService;

    @PostMapping("/order")
    public String placeOrder(@RequestBody OrderDto orderDto) throws Exception {
        System.out.println(orderDto);
        return clientService.placeOrder(orderDto);
    }

    @GetMapping("/order/status")
    public String getOrderStatus(String orderId) {
        return OrderStatus.IN_PREPARATION.getMessageTemplate();
    }

    @GetMapping("/menu")
    public List<FoodOut> getMenu() {
        return List.of(
                new FoodOut(1, "Margarita", "Pizza", "Ser,sos pomidorowy", 20, "bez miesa"),
                new FoodOut(2, "Pepperoni", "Pizza", "Ser,peperoni,sos pomidorowy", 20, "z miesem"),
                new FoodOut(3, "Capriciosa", "Pizza", "Ser,pieczarki, sos pomidorowy", 20, "bez miesa"),
                new FoodOut(4, "Hawajska", "Pizza", "Ser,szynka, ananas, sos pomidorowy", 20, " miesem")
        );
    }



}
