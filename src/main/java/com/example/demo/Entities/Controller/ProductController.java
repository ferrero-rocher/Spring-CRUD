package com.example.demo.Entities.Controller;

import com.example.demo.Entities.Interface.ProductsInterface;
import com.example.demo.Entities.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController

@RequestMapping(value="api/v1")
public class ProductController {
    @Autowired
    ProductsInterface prodservice;




    //get all products
    @GetMapping(value = "/products")
    public List<Product> getProducts()
    {

     return this.prodservice.getProducts();
    }
    //get one single product by id
    @GetMapping(value = "/products/{id}")
    public Product getProduct(@PathVariable String id)
    {
        return this.prodservice.getProduct(Integer.parseInt(id));
    }

    //post one product
    @PostMapping("/products")
    public ResponseEntity<String> postProduct(@Valid @RequestBody Product p)
    {
        return new ResponseEntity<String>(this.prodservice.postProduct(p), HttpStatus.CREATED);
    }

    @PutMapping("/products")
    public String updateProducts(@RequestBody Product p)
    {
        return this.prodservice.updateProducts(p);
    }

    @PutMapping("/products/{id}")
    public String updateProductById( @PathVariable String id , @RequestBody Product p)
    {
        return this.prodservice.updateProductById(p,id);
    }

    @GetMapping(value = "/webservice")
    public List<Product> getProductswebservice()
    {

     return this.prodservice.getProductswebservice();



    }


}
