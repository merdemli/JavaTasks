package com.company;

import business.concretes.ProductManager;
import dataAccess.concretes.InMemoryProductDao;
import entities.concretes.Product;

public class Main {

    public static void main(String[] args) {

        ProductManager manager = new ProductManager(new InMemoryProductDao());


//        Product product5 = new Product();
//        product5.setProductId(5);
//        product5.setProductName("table");
//        product5.setUnitPrice(10000);
//        product5.setUnitInStock(25);
//        product5.setCategoryId(6);
//
       manager.add(new Product(5,3,"phone",20,7000));
//
       for(Product pr : manager.getAll()){
            System.out.println("id'si" + pr.getProductId()+ " olan ürünün adı: " +pr.getProductName());
       }
//
        manager.add(new Product(5,3,"kasa",20,7000));
//        manager.update(product5);
//
//        for(Product pr : manager.getAll()){
//            System.out.println("id'si" + pr.getProductId()+ " olanürünün adı: " +pr.getProductName());
//        }
//        manager.getById(1);
    }

}
