package com.komitleo.shopdemo.admin.model;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Getter
public class AdminProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String category;
    private String description;
    private BigDecimal price;
    private String currency;
}
