package com.shopproject.shopproject;

/**
 * Created by admin on 18.01.2019.
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.Serializable;

@Configuration
@EnableWebMvc
public class CorsClass extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/hi")
                .allowedOrigins("http://10.254.5.76:8081",
                        "http://10.254.5.65:8081",
                        "http://10.254.5.64:8081",
                        "http://10.254.5.77:8081");

        registry.addMapping("/auth/signin")
<<<<<<< HEAD
                .allowedOrigins("http://10.254.5.76:3000", "http://10.254.5.65:3000", "http://10.254.5.64:3000", "http://10.254.5.77:3000");
        registry.addMapping("/**");
=======
                .allowedOrigins("http://10.254.5.76:3000",
                        "http://10.254.5.65:3000",
                        "http://10.254.5.64:3000",
                        "http://10.254.5.77:3000");

>>>>>>> 22f7479b2f02d402e8c54ee21afcdf6be907a57b
        registry.addMapping("/me")
                .allowedOrigins("http://10.254.5.76:3000",
                        "http://10.254.5.65:3000",
                        "http://10.254.5.64:3000",
                        "http://10.254.5.77:3000");
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AuthenticationRequest implements Serializable {
        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }
}