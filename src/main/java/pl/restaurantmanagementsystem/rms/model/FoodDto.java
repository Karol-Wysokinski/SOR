package pl.restaurantmanagementsystem.rms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.restaurantmanagementsystem.rms.entity.food.Size;

@Getter
@AllArgsConstructor
public class FoodDto {
    private String value;
    private Integer menuId;
    private Size size;

}