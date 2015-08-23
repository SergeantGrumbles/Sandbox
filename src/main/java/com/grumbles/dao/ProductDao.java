package com.grumbles.dao;

import com.grumbles.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ProductDao extends Repository<ProductEntity, Long> {

    ProductEntity findById(long id);
}
