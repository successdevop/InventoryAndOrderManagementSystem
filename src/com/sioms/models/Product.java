package com.sioms.models;

import com.sioms.enums.ProductCategory;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product{
    private String id;
    private String productName;
    private String description;
    private ProductCategory category;
    private BigDecimal price;
    private String sku;
    private int minimumStockLevel;
    private LocalDate dateCreated;
    private boolean status;

    public Product(){}

    public Product(String id, String productName, String description, ProductCategory category, BigDecimal price, String sku, int minimumStockLevel, LocalDate dateCreated, boolean status){
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.category = category;
        this.price = price;
        this.sku = sku;
        this.minimumStockLevel = minimumStockLevel;
        this.dateCreated = dateCreated;
        this.status = status;
    }

    public Product(Product source){
        this.id = source.id;
        this.productName = source.productName;
        this.description = source.description;
        this.category = source.category;
        this.price = source.price;
        this.sku = source.sku;
        this.minimumStockLevel = source.minimumStockLevel;
        this.dateCreated = source.dateCreated;
        this.status = source.status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getMinimumStockLevel() {
        return minimumStockLevel;
    }

    public void setMinimumStockLevel(int minimumStockLevel) {
        this.minimumStockLevel = minimumStockLevel;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}