package pl.restaurantmanagementsystem.rms.model;

import lombok.ToString;
import pl.restaurantmanagementsystem.rms.modelIn.FoodIn;

import java.util.List;

@ToString
public class OrderDto {
    public List<FoodIn> foodInList;

}
