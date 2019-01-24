package com.shopproject.shopproject;

/**
 * Created by admin on 18.01.2019.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
//@PropertySource("classpath:config.properties")
public class CorsClass extends WebMvcConfigurerAdapter {

    //    @Autowired
//    private Environment environment;
//
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/hi")
                .allowedOrigins("http://10.254.5.76:8080", "http://10.254.5.65:8080", "http://10.254.5.64:8080", "http://10.254.5.77:8080");
    }
}