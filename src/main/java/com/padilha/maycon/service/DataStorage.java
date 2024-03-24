package com.padilha.maycon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.padilha.maycon.model.Product;

@Component
public class DataStorage {
    private List<Product> data = new ArrayList<>();

    public DataStorage() {
        data.add(new Product("Arroz", "Descrição do Arroz", 2.50, true));
        data.add(new Product("Feijão", "Descrição do Feijão", 3, false));
        data.add(new Product("Macarrão", "Descrição do Macarrão", 1.80, true));
    }

    public void salvarObjeto(Product objeto) {
        data.add(objeto);
    }

    public List<Product> obterTodosObjetos() {
        return data;
    }
}

