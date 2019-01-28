package com.shopproject.shopproject.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * Created by admin on 24.01.2019.
 */

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String name;
}
