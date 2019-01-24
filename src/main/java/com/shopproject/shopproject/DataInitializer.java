package com.shopproject.shopproject;

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
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
//        log.debug("initializing vehicles data...");
//        Arrays.asList("moto", "car").forEach(v -> this.vehicles.saveAndFlush(Vehicle.builder().name(v).build()));

//        log.debug("printing all vehicles...");
//        this.vehicles.findAll().forEach(v -> log.debug(" Vehicle :" + v.toString()));

        this.users.save(new User("user",this.passwordEncoder.encode("password"),Arrays.asList("ROLE_USER" )));

        this.users.save(new User("admin",this.passwordEncoder.encode("password"),Arrays.asList("ROLE_USER","ROLE_ADMIN" )));

//        log.debug("printing all users...");
//        this.users.findAll().forEach(v -> log.debug(" User :" + v.toString()));
    }
}
