package com.shopproject.shopproject.service;

import com.shopproject.shopproject.domain.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {
    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout();

    Double getTotal();
}
