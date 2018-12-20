package com.lishi.moduledb;

import com.lishi.moduledb.dao.ProductDao;
import com.lishi.moduledb.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ModuleDbApplicationTests {

    @Autowired
    private ProductDao  productDao;


    @Test
    public void contextLoads() {

        Product product = new Product();
        product.setId(1L);
        product.setCode("AA1");
        product.setName("苹果手机");
        product.setPrice(8000D);
        productDao.save(product);
    }

}

