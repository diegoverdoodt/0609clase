/*package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private List<Product> productsRepo = new ArrayList<>();

    public ProductController(){
        productsRepo.add(new Product(1l,"Viny","puto"));
        productsRepo.add(new Product(2l,"Funny","pout"));
        productsRepo.add(new Product(3l,"Archi","ptou"));

    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct (@RequestBody Product product) {
        productsRepo.add(product);
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Product> list() {
        return productsRepo;
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Product getProductByID(@PathVariable long id) {
        Product response = null;
        for (Product product : productsRepo) {
            if (product.getId() == id) {
                response = product;
            }
        }
        return response;
    }


    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public List<Product> delecteProductByID(@PathVariable long id) {
        Product response = null;
        for (Product product : productsRepo) {
            if (product.getId() == id) {
                response = product;
            }
        }
        if (response != null) {
            productsRepo.remove(response);
        }
        return productsRepo;
    }

}*/

