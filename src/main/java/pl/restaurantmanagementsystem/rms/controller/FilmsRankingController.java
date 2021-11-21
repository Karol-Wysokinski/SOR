package pl.restaurantmanagementsystem.rms.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.restaurantmanagementsystem.rms.model.OrderDto;
import pl.restaurantmanagementsystem.rms.model.ResponseUser;
import pl.restaurantmanagementsystem.rms.modelOut.FoodOut;
import pl.restaurantmanagementsystem.rms.service.ClientService;
import pl.restaurantmanagementsystem.rms.service.FilmsRankingService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/ranking")
public class FilmsRankingController {

    private FilmsRankingService filmsRankingService;

    @GetMapping
    public List<ResponseUser> getFilmsRanking() throws Exception {
        return filmsRankingService.getFilmsRanking();
    }
}
