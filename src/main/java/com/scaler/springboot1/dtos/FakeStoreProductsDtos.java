package com.scaler.springboot1.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductsDtos {
    private long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}
