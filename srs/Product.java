package srs;

import java.util.ArrayList;
import java.util.List;

public class Product{
    private int Id;
    private String Name;
    private double  Price;

    public Product(int id, String name, double price) {
        Id = id;
        Name = name;
        Price = price;
    }


    @Override
    public String toString() {
        return "Products{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
