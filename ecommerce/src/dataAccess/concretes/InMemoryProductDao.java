package dataAccess.concretes;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductDao implements ProductDao {

    List<Product>products;

    public InMemoryProductDao() {

        products = new ArrayList<Product>();
        products.add(new Product( 1,1,"Laptop",20,20000));
        products.add(new Product( 2,1,"Drone",40,40000));
        products.add(new Product( 3,2,"Mouse",10,200));
    }

    @Override
    public void add(Product product) {
        products.add(product);
        System.out.println("product added");

    }

    @Override
    public void delete(Product product) {
        products.remove(product);

    }

    @Override
    public void update(Product product) {

        Product productToUpdate = new Product();

        for (Product i: products){
            if(i.getProductId()==product.getProductId()) { //gönderilen ürün id'sine sahip listedeki ürün bulunur

                productToUpdate = i;
                productToUpdate.setProductName(product.getProductName());
                productToUpdate.setUnitPrice(product.getUnitPrice());
                productToUpdate.setCategoryId(product.getCategoryId());
                productToUpdate.setUnitInStock(product.getUnitInStock());
                productToUpdate.setCategoryId(product.getCategoryId());
            }

        }
        System.out.println("product updated");
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(int productId) {

        Product p = new Product();
        for (Product i: products){

            if(i.getProductId()==productId){
                p = i;
            }
        }
        System.out.println(p.getProductName());
        return p;
    }

    @Override
    public Product getByName(Product product) {
        Product p = new Product();
        for (Product i: products){

            if(i.getProductName()==product.getProductName()){
                p = i;
            }
        }
        return p;
    }

}
