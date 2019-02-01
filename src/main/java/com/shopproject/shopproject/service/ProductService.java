package com.shopproject.shopproject.service;

import com.shopproject.shopproject.domain.Product;

import java.util.Optional;

public interface ProductService {
    Optional<Product> findById(Long id);
}
