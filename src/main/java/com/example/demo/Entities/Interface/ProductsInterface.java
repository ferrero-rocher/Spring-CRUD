package com.example.demo.Entities.Interface;

import com.example.demo.Entities.Models.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductsInterface {

    public List<Product> getProducts();
    public List<Product> getProductswebservice();
    public Product getProduct(int  id);
    public String postProduct(Product p);
    public String updateProducts(Product p);
    public String updateProductById(Product p ,String id);
}
