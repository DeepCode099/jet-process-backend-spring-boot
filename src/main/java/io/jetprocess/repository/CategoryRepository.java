package io.jetprocess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.jetprocess.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
