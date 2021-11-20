package pl.restaurantmanagementsystem.rms.modelIn;

import lombok.*;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@NoArgsConstructor
public class FoodIn {
    private Integer menuItem;
    private String size;
}
