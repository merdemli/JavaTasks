package business.concretes;

import business.abstracts.ProductService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

   private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao= productDao;
    }

    @Override
    public void add(Product product) {

        if (isAlreadyExist(product)){
            System.out.println("this product is already exist");
        }else
            this.productDao.add(product);


    }

    @Override
    public void delete(Product product) {
        productDao.delete(product);

    }

    @Override
    public void update(Product product) {
        productDao.update(product);

    }

    @Override
    public Product getById(int productId) {
        return productDao.getById(productId);
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }

    public boolean isAlreadyExist(Product product){
        for(Product i : productDao.getAll()) {
            if(product.getProductName().toLowerCase().equals(i.getProductName().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
