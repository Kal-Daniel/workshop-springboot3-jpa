package com.teikkodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teikkodev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
