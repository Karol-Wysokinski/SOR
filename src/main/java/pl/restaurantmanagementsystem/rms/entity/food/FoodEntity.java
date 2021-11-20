package pl.restaurantmanagementsystem.rms.entity.food;

import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.restaurantmanagementsystem.rms.model.FoodDto;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class FoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer menuId;

    @Enumerated(EnumType.STRING)
    private Size size;
    private String value;

    public FoodEntity(Integer menuId, Size size, String value) {
        this.menuId = menuId;
        this.size = size;
        this.value = value;
    }

    public FoodDto toDto() {
        return new FoodDto(this.value, this.menuId, this.size);
    }
}
