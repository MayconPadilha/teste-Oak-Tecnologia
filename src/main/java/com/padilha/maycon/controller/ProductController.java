package com.padilha.maycon.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.padilha.maycon.model.Product;
import com.padilha.maycon.service.DataStorage;

@Controller
public class ProductController {
    
    @Autowired
    private DataStorage dataStorage;

    @GetMapping("/")
    public String list_product() {
        return "redirect:/list_products";
    }

    @GetMapping("/list_products")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView("list_products");

        List<Product> listProducts = dataStorage.obterTodosObjetos();

        Collections.sort(listProducts, Comparator.comparingDouble(Product::getValueProduct));

        mv.addObject("products", listProducts);
        return mv;
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }

    @PostMapping("/form")
    public String registerProduct(Product data) {
        dataStorage.salvarObjeto(data);
        return "redirect:/list_products";
    }

}