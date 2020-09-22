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
        Student[] sectionFStudents = new Student[70];
        for (int i = 0; i < sectionFStudents.length; i++) {
            sectionFStudents[i] = new Student(
                    (i + 1),
                    "Name " + (i + 1),
                    (float) (Math.random() * 100.0f)
            );
        }
        System.out.println(Arrays.toString(sectionFStudents));
        Arrays.sort(sectionFStudents);
        System.out.println(Arrays.toString(sectionFStudents));

    }
}


