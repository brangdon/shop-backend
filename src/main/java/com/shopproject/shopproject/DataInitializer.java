package com.shopproject.shopproject;

import com.shopproject.shopproject.domain.Product;
import com.shopproject.shopproject.repository.ProductRepository;
import com.shopproject.shopproject.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.shopproject.shopproject.domain.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

    @Autowired
    UserRepository users;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {

        this.users.save(new User("user", this.passwordEncoder.encode("password"), Arrays.asList("ROLE_USER")));

        this.users.save(new User("admin", this.passwordEncoder.encode("password"), Arrays.asList("ROLE_USER", "ROLE_ADMIN")));

        this.productRepository.save(new Product("title1", "author1", Double.valueOf(12.2),"description1", Arrays.asList("category1", "category2"), "photo1"));
        this.productRepository.save(new Product("title2", "author2", Double.valueOf(34.4),"description2",Arrays.asList("category1", "category2", "category3"), "photo2"));
        this.productRepository.save(new Product("title3", "author3", Double.valueOf(32.6),"description3", Arrays.asList("category3"), "photo3"));
    }
}
