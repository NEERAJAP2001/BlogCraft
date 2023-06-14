package com.social.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
