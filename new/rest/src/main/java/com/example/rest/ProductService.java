package com.example.rest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
@Service
public class ProductService {
    List<Product> listOfProducts =new ArrayList<>();
    public List<Product> getAllProducts(){

        listOfProducts.add(new Product("123","iphone x","This is Awesome Iphone",34596.0, "RAMA"));
        listOfProducts.add(new Product("124","samsung","This is cool",7.0,"hari"));
        listOfProducts.add(new Product("124","MI","This is bad",8.0,"Rajat"));
        return listOfProducts;

    }
    public Product getProductById(String id)
    {
        Predicate<Product>byId=p->p.getId().equals(id);
        return filterProducts(byId);
    }
    private Product filterProducts(Predicate<Product>strategy)
    {
        return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
    }
    public Product addProduct(Product newProduct)
    {
        listOfProducts.add(newProduct);
        return newProduct;
    }
}