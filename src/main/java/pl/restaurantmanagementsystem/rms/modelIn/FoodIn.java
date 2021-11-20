package pl.restaurantmanagementsystem.rms.modelIn;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
public class FoodIn {
    private Integer menuItem;
    private String size;
}
