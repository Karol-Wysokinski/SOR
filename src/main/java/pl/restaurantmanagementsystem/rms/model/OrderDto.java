package pl.restaurantmanagementsystem.rms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.restaurantmanagementsystem.rms.modelIn.FoodIn;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private List<FoodIn> foodInList;

}
