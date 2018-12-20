package com.lishi.moduledb.dao;

import com.lishi.moduledb.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {


    void save(Product product);

    int delete(Product product);

    int update(Product product);

    Product findTopOne(Product product);

    Product findList(Product product);

    List<Product> findAll();

}
