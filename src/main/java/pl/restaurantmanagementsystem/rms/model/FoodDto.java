package pl.restaurantmanagementsystem.rms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.restaurantmanagementsystem.rms.repository.food.Size;

@Getter
@AllArgsConstructor
public class FoodDto {
    private String value;
    private String menuId;
    private Size size;

}