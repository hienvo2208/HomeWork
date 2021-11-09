package model;

import com.google.gson.annotations.SerializedName;

public class Fashion implements Comparable<Fashion> {
    @SerializedName("id")
    private int id;
    private Category category = Category.FASHION;
    @SerializedName("name")
    private String name;
    @SerializedName("cost")
    private double price;
    @SerializedName("status")
    private int status;
    @SerializedName("sold")
    private int sold;

    public Fashion() {
    }

    public Fashion(int id, Category category, String name, double price, int status, int sold) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
        this.status = status;
        this.sold = sold;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Fashion{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", sold=" + sold +
                '}';
    }

    @Override
    public int compareTo(Fashion o) {
        if(this.sold > o.getSold()){
            return 1;
        }else if(this.sold < o.getSold()){
            return -1;
        }else{
            return 0;
        }
    }
}
