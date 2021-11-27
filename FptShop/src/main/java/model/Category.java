package model;

public enum Category {
    PHONE("Điện thoại"),
    LAPTOP("Laptop"),
    APPLE("Apple"),
    ACCESSORY("Phụ kiện");
    String value;

    Category(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }
}
