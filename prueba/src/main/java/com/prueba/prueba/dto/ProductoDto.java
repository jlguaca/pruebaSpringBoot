package com.prueba.prueba.dto;

import javax.validation.constraints.*;
import java.util.Date;

public class ProductoDto {
    @NotBlank
    private int id;
    private Date creation_date;
    private String description;
    private Date expiry_date;
    @NotBlank
    private String name;
    @Min(0)
    private int price;

    public ProductoDto() {
    }

    public ProductoDto(@NotBlank int id, Date creation_date, String description, Date expiry_date,
            @NotBlank String name, @Min(0) int price) {
        this.id = id;
        this.creation_date = creation_date;
        this.description = description;
        this.expiry_date = expiry_date;
        this.name = name;
        this.price = price;
    }

    public Date getCreation_date() {
        return this.creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getExpiry_date() {
        return this.expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
