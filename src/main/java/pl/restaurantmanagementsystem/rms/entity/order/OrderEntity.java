package pl.restaurantmanagementsystem.rms.entity.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.restaurantmanagementsystem.rms.entity.food.FoodEntity;
import pl.restaurantmanagementsystem.rms.model.OrderStatus;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderId;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @OneToMany
    private List<FoodEntity> foodEntityList;

    public OrderEntity(String orderId,
                       OrderStatus orderStatus,
                       List<FoodEntity> foodEntityList) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.foodEntityList = foodEntityList;
    }
}
