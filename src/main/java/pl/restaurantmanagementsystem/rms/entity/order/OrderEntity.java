package pl.restaurantmanagementsystem.rms.entity.order;

import lombok.Getter;
import pl.restaurantmanagementsystem.rms.entity.food.FoodEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderId;

    @OneToMany
    private List<FoodEntity> foodEntityList;

    public OrderEntity(String orderId, List<FoodEntity> foodEntityList) {
        this.orderId = orderId;
        this.foodEntityList = foodEntityList;
    }
}
