package com.grumbles.service;

import com.grumbles.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public String getProductName(long id) {
        return productDao.findById(id).getName();
    }
}
