/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/09/20
 *  Time: 1:35 PM
 *  File Name : StringFunctionalInterface.java
 * */
package lambdaexpressions.examples.three;

import java.util.function.Function;

// AWT, Swing, JavaFX
class Main {
    Function<Integer, Integer> factorial = (number) -> {
        int result = 1;
        for (Integer integer = 1; integer <= number; integer++) {
            result = result * integer;
        }
        return result;
    };
}
