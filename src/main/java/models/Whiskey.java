package models;

public class Whiskey {
    private int id;
    private String name;
    private String brand;
    private String region;
    private int size;
    private int qty;
    private double price;

    public Whiskey(int id, String name, String brand, String region, int size, int qty, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.region = region;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }

    public Whiskey(){}

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getRegion() {
        return region;
    }

    public int getSize() {
        return size;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
