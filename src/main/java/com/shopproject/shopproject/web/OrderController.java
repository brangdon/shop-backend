package com.shopproject.shopproject.web;

import com.shopproject.shopproject.domain.Order;
import com.shopproject.shopproject.domain.Product;
import com.shopproject.shopproject.domain.User;
import com.shopproject.shopproject.repository.OrderRepository;
import com.shopproject.shopproject.repository.ProductRepository;
import com.shopproject.shopproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * Created by admin on 24.01.2019.
 */
@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = {"http://localhost:3000", "http://10.254.5.76:3000", "http://10.254.5.65:3000", "http://10.254.5.64:3000", "http://10.254.5.77:3000"})
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String getOrders() {
        String json = "[{\"message\":\"success\"}}]";
        return json;
    }

    @GetMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String addOrder() {

//        Product p = new Product("aa", "aaa", "ssd", Arrays.asList("ss"), "gg");
        Order o = new Order();
        orderRepository.save(o);

        String json = "[{\"message\":\"success\"}}]";
        return json;
    }
}