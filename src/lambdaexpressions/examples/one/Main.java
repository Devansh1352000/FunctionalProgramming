/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/09/20
 *  Time: 1:15 PM
 *  File Name : Main.java
 * */
package lambdaexpressions.examples.one;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface1 interface1;
        // reference variable of a functional interface.
        interface1 = () -> 1234.5;
        System.out.println(interface1.method());
        interface1 = () -> Math.random() * 100.0;
        System.out.println(interface1.method());
    }
}
// Interface (Defining the signature of a method)
// -> Child Class (Implementing the body of the method)
// -> Execution (Created an object of the Child class to call the method)
