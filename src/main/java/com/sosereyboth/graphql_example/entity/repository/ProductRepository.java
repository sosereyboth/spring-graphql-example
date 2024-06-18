package com.sosereyboth.graphql_example.entity.repository;

import com.sosereyboth.graphql_example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
