/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/09/20
 *  Time: 10:15 AM
 *  File Name : Example2.java
 * */
package functionainterfaces.examples;

@FunctionalInterface // annotation <- just checking the syntax of the interface
public interface Example2 {
    static void method2() {

    }

    void method();

    private void method1() {

    }

    default void method3() {

    }

    @Override
    int hashCode();

    @Override
    boolean equals(Object object);

    @Override
    String toString();
}

interface E3 {
    void m3();
}