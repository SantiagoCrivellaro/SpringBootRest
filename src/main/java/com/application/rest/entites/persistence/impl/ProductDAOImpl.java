package com.application.rest.entites.persistence.impl;

import com.application.rest.entites.Product;
import com.application.rest.entites.persistence.IProductDAO;
import com.application.rest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Component
public class ProductDAOImpl implements IProductDAO {


    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return repository.findProductByPriceInRange(minPrice, maxPrice);
    }

    @Override
    public void save(Product product) {

        repository.save(product);
    }

    @Override
    public void deletebyId(Long id) {

        repository.deleteById(id);
    }
}


