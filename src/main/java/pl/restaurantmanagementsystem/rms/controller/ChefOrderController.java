package pl.restaurantmanagementsystem.rms.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.restaurantmanagementsystem.rms.model.OrderStatus;
import pl.restaurantmanagementsystem.rms.modelOut.OrderChefOut;
import pl.restaurantmanagementsystem.rms.service.ChefService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/chef")
public class ChefOrderController {

    private ChefService chefService;

    @GetMapping("/order-list")
    public List<OrderChefOut> getOrderList() {
        return chefService.getOrderList();
    }
}
