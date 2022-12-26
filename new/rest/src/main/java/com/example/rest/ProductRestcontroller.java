package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestcontroller {
    @Autowired
    ProductService productService;
    @GetMapping("/products")

    public List<Product>getAllProducts()
    {
        return productService.getAllProducts();
    }
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") String productId){
        Product product=productService.getProductById(productId);
        if(product==null)
        {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<Product> (product, HttpStatus.OK);
    }
    @PostMapping("/product/add")
    public Product addProduct(@RequestBody Product newProduct)

    {
        return productService.addProduct(newProduct);
    }

}