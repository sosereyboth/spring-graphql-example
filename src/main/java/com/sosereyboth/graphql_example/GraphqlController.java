package com.sosereyboth.graphql_example;

import com.sosereyboth.graphql_example.entity.Category;
import com.sosereyboth.graphql_example.entity.Product;
import com.sosereyboth.graphql_example.entity.repository.CategoryRepository;
import com.sosereyboth.graphql_example.entity.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class GraphqlController {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @QueryMapping()
    public List<Product> getProducts(){

        return productRepository.findAll();
    }

    @QueryMapping()
    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }
}
