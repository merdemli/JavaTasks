package entities.concretes;

import entities.abstracts.Entity;

public class Product implements Entity {

    private int productId;
    private int categoryId;
    private String productName;
    private int unitInStock;
    private double unitPrice;

    public Product() {
    }

    public Product(int productId, int categoryId, String productName, int unitInStock, double unitPrice) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.productName = productName;
        this.unitInStock = unitInStock;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
