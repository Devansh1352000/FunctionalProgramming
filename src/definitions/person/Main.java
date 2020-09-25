/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/09/20
 *  Time: 11:16 AM
 *  File Name : Main.java
 * */
package definitions.person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[10];
        for (int i = 0; i < teachers.length; i++) {
            teachers[i] = new Teacher(
                    (int) (Math.random() * 100),
                    "Mr. " + (i + 1),
                    "BCSC 100" + i,
                    50_000.0 + ((int) (Math.random() * 1000) * 10)
            );
        }
        System.out.println(Arrays.toString(teachers));
        Arrays.sort(teachers);
        System.out.println(Arrays.toString(teachers));
    }
}




















