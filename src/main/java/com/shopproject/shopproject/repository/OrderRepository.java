package com.shopproject.shopproject.repository;

import com.shopproject.shopproject.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by admin on 24.01.2019.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findById(Long id);
}
