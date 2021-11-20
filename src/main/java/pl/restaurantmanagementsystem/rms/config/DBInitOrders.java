package pl.restaurantmanagementsystem.rms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pl.restaurantmanagementsystem.rms.repository.FoodRepository;
import pl.restaurantmanagementsystem.rms.entity.food.FoodEntity;
import pl.restaurantmanagementsystem.rms.entity.food.Size;

@Component
public class DBInitOrders implements ApplicationRunner {

    private FoodRepository foodRepository;

    @Autowired
    public DBInitOrders(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    public void run(ApplicationArguments args){
        foodRepository.save(new FoodEntity(1, Size.M,"Margarita", "pizza","", 20d,"smaczne" ));
        foodRepository.save(new FoodEntity(2, Size.M,"Capriciosa", "pizza","", 23d,"smaczne" ));
        foodRepository.save(new FoodEntity(3, Size.M,"Hawajska", "pizza","", 25.30,"smaczne" ));
        foodRepository.save(new FoodEntity(4, Size.M,"Mafiozo", "pizza","", 40d,"smaczne" ));
    }
}