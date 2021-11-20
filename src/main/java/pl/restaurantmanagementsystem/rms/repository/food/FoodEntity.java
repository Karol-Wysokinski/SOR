package pl.restaurantmanagementsystem.rms.repository.food;

import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.restaurantmanagementsystem.rms.model.FoodDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class FoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String value;

    public FoodEntity(String value) {
        this.value = value;
    }

    public FoodDto toDto() {
        return new FoodDto(this.value);
    }
}
