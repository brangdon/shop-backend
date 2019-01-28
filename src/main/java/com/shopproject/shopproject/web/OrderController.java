package com.shopproject.shopproject.web;

import com.shopproject.shopproject.domain.Order;
import com.shopproject.shopproject.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    public @ResponseBody String getOrders() {
        String json = "[{\"message\":\"success\"}}]";
        return json;
    }

    @GetMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String addOrder() {

        Order o = new Order();
        orderRepository.save(o);

        String json = "[{\"message\":\"success\"}}]";
        return json;
    }
}