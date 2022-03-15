package dataAccess.abstracts;

import entities.concretes.Product;

import java.util.List;

public interface ProductDao {

    void add(Product product);
    void delete(Product product);
    void update(Product product);
    List<Product> getAll();
    Product getById(int productId);
    Product getByName(Product product);

}
