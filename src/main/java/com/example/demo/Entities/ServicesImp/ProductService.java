package com.example.demo.Entities.ServicesImp;

import com.example.demo.Entities.DAO.ProductDAO;
import com.example.demo.Entities.Interface.ProductsInterface;
import com.example.demo.Entities.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements ProductsInterface {
    @Autowired
    ProductDAO productDAO;
    @Autowired
    RestTemplate restTemplate;

    private List<Product> prodlist;

    public ProductService()
    {
        Product product1 = new Product(1,"pro1","This is product 1");
        Product product2 = new Product(2,"pro2","This is product 2");
        prodlist = new ArrayList<>();
        prodlist.add(product1);
        prodlist.add(product2);
    }



    @Override
    public List<Product> getProducts()
    {
       // return prodlist;
        return this.productDAO.findAll();
    }

    @Override
    public Product getProduct(int id)
    {
//        Product p=null;
//        for(Product prod : prodlist)
//        {
//            if(prod.getId()==id)
//            {
//                p = prod;
//            }
//        }
//        return p;

        Optional<Product> product =  this.productDAO.findById(id);
        if(product.isPresent())
        {

            return product.get();
        }
        return null;
    }

    public String postProduct(Product p)
    {
        //prodlist.add(p);
         this.productDAO.save(p);
        return "Product added succesfully";
    }
    public String updateProducts(Product p)
    {
        this.productDAO.save(p);
        return "one product updated";
    }
    @Override
    public String updateProductById(Product p ,String id)
    {
        Optional<Product> product =  this.productDAO.findById(Integer.parseInt(id));
        p.setId(Integer.parseInt(id));
        if(product.isPresent())
        {

            productDAO.save(p);
            return "1 product updated";

        }
        return "no match found for given id";

    }

    @Override
    public  List<Product> getProductswebservice()
    {
       // ResponseEntity<List> ans = restTemplate.getForEntity("http://localhost:8080/api/v1/products",List.class);
        System.out.println(restTemplate.getForEntity("http://localhost:8080/api/v1/products",List.class));
        List<Product> ans = restTemplate.getForObject("http://localhost:8080/api/v1/products",List.class);
        return ans;
    }





}
