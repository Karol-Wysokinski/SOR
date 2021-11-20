package pl.restaurantmanagementsystem.rms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.restaurantmanagementsystem.rms.entity.order.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {



}
