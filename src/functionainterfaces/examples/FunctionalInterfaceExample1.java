/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 22/09/20
 *  Time: 1:12 PM
 *  File Name : FunctionalInterfaceExample1.java
 * */
package functionainterfaces.examples;

@FunctionalInterface
public interface FunctionalInterfaceExample1 {
    static void connect() {

    }

    void method(); // 1

    //    void method1();
    int hashCode(); // 2

    // Before Java JDK 8 (2014), we could only create abstract methods in an Interface.
    private void show() {

    }

    default void add() {

    }
}
