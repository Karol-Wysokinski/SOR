package pl.restaurantmanagementsystem.rms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.restaurantmanagementsystem.rms.entity.food.FoodEntity;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntity, String> {
    List<FoodEntity> findAll();
    FoodEntity getByMenuId(Integer menuId);
}
