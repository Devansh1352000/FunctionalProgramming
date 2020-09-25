/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/09/20
 *  Time: 1:26 PM
 *  File Name : NumericTest.java
 * */
package lambdaexpressions.examples.two;

@FunctionalInterface
public interface NumericTest {
    boolean test(int number);
}

class Main {
    public static void main(String[] args) {
        NumericTest evenTester = (number) -> number % 2 == 0;
        // The body of the method is a single expression,
        // This type of lambda is called an `Expression Lambda`.
        NumericTest negativeTester = (number) -> {
            return number >= 0;
        };
        // This lambda expression has a block of code as the body
        // This type of lambda is called a `Block Lambda`.

    }
}
