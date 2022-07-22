package srs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "1", 1));
        products.add(new Product(2, "2", 2));
        products.add(new Product(2, "2", 2));

        List<User> users = new ArrayList<>();
        users.add(new User(1,"Alex", "Black", 1000));
        users.add(new User(2, "Bill", "White", 2000));
        users.add(new User(3, "Jack", "Java", 3000));

        //showUser();

    }

    /*private static void showUser() {
        for (int i: products) {
            System.out.println(products);
        }
        System.out.println(prodacts);
    }*/
}
