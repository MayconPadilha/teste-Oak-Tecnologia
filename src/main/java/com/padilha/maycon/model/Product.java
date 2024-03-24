package com.padilha.maycon.model;

import lombok.Data;

@Data
public class Product {
    // private int id;
    private String nameProduct;
    private String descriptionProduct;
    private double valueProduct;
    private boolean availableForSale;


    public Product(String nameProduct, String descriptionProduct, double valueProduct, boolean availableForSale) {
        // this.id = id;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.valueProduct = valueProduct;
        this.availableForSale = availableForSale;
    }





}
