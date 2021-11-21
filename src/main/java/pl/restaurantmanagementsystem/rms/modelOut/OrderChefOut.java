package pl.restaurantmanagementsystem.rms.modelOut;

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
public class OrderChefOut {
    private String orderId;
    private List<FoodChefOut> foodInList;
}
