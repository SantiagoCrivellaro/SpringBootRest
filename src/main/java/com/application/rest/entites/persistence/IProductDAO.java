package com.application.rest.entites.persistence;

import com.application.rest.entites.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductDAO {

    List<Product> findAll();

    Optional<Product> findById(Long id);


    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

    void save(Product product);

    void deletebyId(Long id);
}
