package pl.restaurantmanagementsystem.rms.modelOut;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
public class FoodOut {
    private Integer menuItem;
    private String foodName;
    private String foodCategory;
    private String foodDescription;
    private double foodPrice;
    private String foodDetails;
}
