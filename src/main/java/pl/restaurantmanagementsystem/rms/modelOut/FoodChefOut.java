package pl.restaurantmanagementsystem.rms.modelOut;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
public class FoodChefOut {
    private Integer menuItem;
    private String foodName;
    private String foodDescription;
    private String foodDetails;
}
