package pl.restaurantmanagementsystem.rms.entity.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.restaurantmanagementsystem.rms.entity.food.FoodEntity;
import pl.restaurantmanagementsystem.rms.model.OrderStatus;
import pl.restaurantmanagementsystem.rms.modelOut.FoodChefOut;
import pl.restaurantmanagementsystem.rms.modelOut.OrderChefOut;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

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


    public OrderChefOut toOrderChefOut(){
        List<FoodChefOut> collect = foodEntityList.stream().map(FoodEntity::toFoodChefOut).collect(Collectors.toList());
        return new OrderChefOut(this.orderId,collect);
    }
}
