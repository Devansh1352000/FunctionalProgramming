/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 24/09/20
 *  Time: 3:09 PM
 *  File Name : Main.java
 * */
package definitions.product;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[10];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product(
                    (int) (Math.random() * 100),
                    "A " + (i),
                    (Math.random() * 100.0) + 100.0
            );
        }
        System.out.println(Arrays.toString(products));
        Arrays.sort(products);
        System.out.println(Arrays.toString(products));
    }
}
