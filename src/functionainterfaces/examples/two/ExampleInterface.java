/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/09/20
 *  Time: 4:09 PM
 *  File Name : ExampleInterface.java
 * */
package functionainterfaces.examples.two;

@FunctionalInterface
public interface ExampleInterface {
    static void method3() {

    }

    static void method31() {

    }

    void method1();

    @Override
    int hashCode();

    @Override
    boolean equals(Object object);

    @Override
    String toString();

    private void method2() {

    }

    default void method4() {

    }

    private void method21() {

    }

    default void method41() {

    }
}
