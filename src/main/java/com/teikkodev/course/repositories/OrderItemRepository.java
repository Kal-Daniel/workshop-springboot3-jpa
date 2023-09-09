package com.teikkodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teikkodev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
