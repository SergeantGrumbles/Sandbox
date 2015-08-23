package com.grumbles.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Product")
public class ProductEntity implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;

    protected ProductEntity() {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly
    }

    public ProductEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
