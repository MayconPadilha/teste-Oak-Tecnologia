package com.padilha.maycon.model;

import lombok.Data;

@Data
public class Product {
    // private int id;
    private String nameProduct;
    private String descriptionProduct;
    private double valueProduct;
    private String availableForSale;


    public Product(String nameProduct, String descriptionProduct, double valueProduct, String availableForSale) {
        // this.id = id;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.valueProduct = valueProduct;
        this.availableForSale = availableForSale;
    }





}
