package com.lishi.productserver.service;

import com.lishi.moduledb.domain.Product;

import java.util.List;

public interface ProductService {


    void save(Product product);

    int delete(Product product);

    int update(Product product);

    Product findTopOne(Product product);

    Product findList(Product product);

    List<Product> findAll();

}
