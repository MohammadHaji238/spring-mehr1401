package com.anisa.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ShoppingCart {
    private String customerName;
    private List<String> products;

    public void addProduct(String product)
    {
        if (getProducts()==null)
        {
            List<String> products=new ArrayList<>();
            products.add(product);
            setProducts(products);
        }
        else {
            getProducts().add(product);
        }
    }
}
