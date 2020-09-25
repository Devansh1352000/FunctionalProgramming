/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/09/20
 *  Time: 1:14 PM
 *  File Name : Mobile.java
 * */
package definitions.communication;

import java.util.Comparator;
import java.util.Objects;

public class Mobile implements Comparable<Mobile>, Comparator<Mobile> {
    // We only want an object of the Mobile type to be comparable
    // with another object of a Mobile type.
    private int id;
    private String modelName;
    private String companyName;
    private double price;

    public Mobile(int id, String modelName, String companyName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.companyName = companyName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
        Mobile mobile = (Mobile) o;
        return getId() == mobile.getId() &&
                Double.compare(mobile.getPrice(), getPrice()) == 0 &&
                Objects.equals(getModelName(), mobile.getModelName()) &&
                Objects.equals(getCompanyName(), mobile.getCompanyName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getModelName(), getCompanyName(), getPrice());
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %d, Model Name: %s, Company Name: %s, Price: %.2f\n",
                this.getId(),
                this.getModelName(),
                this.getCompanyName(),
                this.getPrice()
        );
    }

    // Comparable Interface
    @Override
    public int compareTo(Mobile otherMobile) {
        return Integer.compare(this.getId(), otherMobile.getId());
    }

    // Comparator Interface
    @Override
    public int compare(Mobile o1, Mobile o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
