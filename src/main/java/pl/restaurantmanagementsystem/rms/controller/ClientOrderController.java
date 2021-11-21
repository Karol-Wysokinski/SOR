package pl.restaurantmanagementsystem.rms.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.restaurantmanagementsystem.rms.model.OrderDto;
import pl.restaurantmanagementsystem.rms.model.OrderStatus;
import pl.restaurantmanagementsystem.rms.modelOut.FoodOut;
import pl.restaurantmanagementsystem.rms.service.ClientService;

import javax.websocket.server.PathParam;
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

    @GetMapping("/order/status/{orderId}")
    public String getOrderStatus(@PathVariable String orderId) {
        return clientService.getOrderStatus(orderId).getMessageTemplate();
    }


    @GetMapping("/menu")
    public List<FoodOut> getMenu() {
        return clientService.getMenu();
    }


}
