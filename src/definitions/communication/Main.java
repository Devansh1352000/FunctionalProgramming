/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/09/20
 *  Time: 1:19 PM
 *  File Name : Main.java
 * */
package definitions.communication;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Mobile[] mobiles = new Mobile[10];
        for (int i = 0; i < mobiles.length; i++) {
            mobiles[i] = new Mobile(
                    (int) (Math.random() * 1000),
                    "Name " + (i + 1),
                    " ABCD " + (i + 1),
                    (Math.random() * 20_000.0) + 10_000.0
            );
        }
        System.out.println(Arrays.toString(mobiles));
        Arrays.sort(mobiles);
        System.out.println(Arrays.toString(mobiles));
    }
}









