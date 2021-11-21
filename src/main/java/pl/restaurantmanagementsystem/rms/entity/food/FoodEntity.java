package pl.restaurantmanagementsystem.rms.entity.food;

import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.restaurantmanagementsystem.rms.model.FoodDto;
import pl.restaurantmanagementsystem.rms.modelOut.FoodChefOut;
import pl.restaurantmanagementsystem.rms.modelOut.FoodOut;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class FoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer menuId;


    private Size size;
    private String value;

    private String foodCategory;
    private String foodDescription;
    private double foodPrice;
    private String foodDetails;

    public FoodEntity(Integer menuId,
                      Size size,
                      String value,
                      String foodCategory,
                      String foodDescription,
                      double foodPrice,
                      String foodDetails) {
        this.menuId = menuId;
        this.size = size;
        this.value = value;
        this.foodCategory = foodCategory;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
        this.foodDetails = foodDetails;
    }

    public FoodDto toDto() {
        return new FoodDto(this.value, this.menuId, this.size);
    }

    public FoodOut toFoodOut() {
        return new FoodOut(this.menuId,
                this.value,
                this.foodCategory,
                this.foodDescription,
                this.foodPrice,
                this.foodDetails);
    }

    public FoodChefOut toFoodChefOut() {
        return new FoodChefOut(this.menuId, this.value, this.foodDescription, this.foodDetails);
    }
}
