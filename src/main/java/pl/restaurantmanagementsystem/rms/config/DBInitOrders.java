package pl.restaurantmanagementsystem.rms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pl.restaurantmanagementsystem.rms.repository.FoodRepository;
import pl.restaurantmanagementsystem.rms.repository.food.FoodEntity;

@Component
public class DBInitOrders implements ApplicationRunner {

    private FoodRepository foodRepository;

    @Autowired
    public DBInitOrders(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    public void run(ApplicationArguments args){
        foodRepository.save(new FoodEntity("Margarita"));
        foodRepository.save(new FoodEntity("Capritioza"));
        foodRepository.save(new FoodEntity("Hawajska"));
        foodRepository.save(new FoodEntity("Mafiozo"));
    }
}