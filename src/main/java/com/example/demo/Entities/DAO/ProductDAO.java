package com.example.demo.Entities.DAO;

import com.example.demo.Entities.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends JpaRepository<Product,Integer> {

}
