/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/09/20
 *  Time: 3:06 PM
 *  File Name : ExampleInterface.java
 * */
package functionainterfaces.examples;

// Functional Interface
@FunctionalInterface
public interface ExampleInterface {
    static void method2() {
    }

    void method(); // Abstract Method

    private void method1() {
    }

    default void method3() {
    }

    @Override
    int hashCode();

    @Override
    String toString();

    @Override
    boolean equals(Object object);
}
