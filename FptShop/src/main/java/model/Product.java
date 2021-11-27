package model;

import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("id")
    private long id;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("price")
    private double cost;
    @SerializedName("quantity")
    private int quantity;
    @SerializedName("quantitySold")
    private int quantitySold;
    @SerializedName("brand")
    private String brand;
    @SerializedName("category")
    private Category category;

    public Product() {
    }

    public Product(long id, String name, String description, double cost, int quantity, int quantitySold, String brand, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.quantity = quantity;
        this.quantitySold = quantitySold;
        this.brand = brand;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", quantitySold=" + quantitySold +
                ", brand='" + brand + '\'' +
                ", category=" + category +
                '}';
    }
}
