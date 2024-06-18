package com.sosereyboth.graphql_example.entity.repository;

import com.sosereyboth.graphql_example.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
