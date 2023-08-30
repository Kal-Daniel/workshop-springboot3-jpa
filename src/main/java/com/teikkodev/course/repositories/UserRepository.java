package com.teikkodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teikkodev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
