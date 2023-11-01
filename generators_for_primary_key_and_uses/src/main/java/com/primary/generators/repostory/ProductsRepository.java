package com.primary.generators.repostory;

import com.primary.generators.Products;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Products , Integer> {
}
