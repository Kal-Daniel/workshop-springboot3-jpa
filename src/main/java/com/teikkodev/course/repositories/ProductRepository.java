package com.teikkodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teikkodev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
