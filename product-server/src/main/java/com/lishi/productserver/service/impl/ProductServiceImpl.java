package com.lishi.productserver.service.impl;

import com.lishi.moduledb.dao.ProductDao;
import com.lishi.moduledb.domain.Product;
import com.lishi.productserver.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductDao productDao;

    @Override
    public void save(Product product) {

    }

    @Override
    public int delete(Product product) {
        return 0;
    }

    @Override
    public int update(Product product) {
        return 0;
    }

    @Override
    public Product findTopOne(Product product) {
        return null;
    }

    @Override
    public Product findList(Product product) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }
}
