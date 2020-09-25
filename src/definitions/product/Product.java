/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 24/09/20
 *  Time: 3:06 PM
 *  File Name : Product.java
 * */
package definitions.product;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>, Comparator<Product> {
    // private fields
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return getId() == product.getId() &&
                Double.compare(product.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice());
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %d, Name: %s, Price: %.2f\n",
                this.getId(), this.getName(), this.getPrice()
        );
    }


    // product1.compareTo(product2) <- Product
    // Comparable Interface
    @Override
    public int compareTo(Product otherProduct) { // o <- Object
        return Integer.compare(this.getId(), otherProduct.getId());
    }

    // Comparator Interface
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
