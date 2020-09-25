# Functional Style Programming in Java

1. Functional Interfaces / SAM Interface / SAM Type 

`Definition`: A `functional interface` is an interface that contains one and only one
 abstract method. Thus, the functional interface represents a single action or function.
- A functional interface is sometimes also referred to as a `SAM type`, where SAM
 means `Single Abstract Method`.
- A functional interface can also specify any public methods of the Object class, 
 such as the `equals()`, `hashcode()`, and `toString()` methods etc,
  without breaking the rule for a functional interface.
- The public methods of the `java.lang.Object` class are considered implicit members of
a functional interface because they are automatically implemented by an instance of a
 functional interface.
- Before Java JDK 8 (in 2014) was released, we could only have abstract methods in an
interface in Java, but from JDK 9 onward, we can have `private` methods, `static` methods,
and `default` methods that are non-abstract in an interface.
- Because `non-default`, `non-static`, and `non-private` interface methods 
are implicitly abstract, we can skip writing the `abstract` keyword in the method
 signature.

2. Lambda Expressions
- In Java, the implementation of Lambda Expressions, consists of two concepts-
    - Functional Interfaces
    - Lambda Expressions (itself)
- `Definition`: A lambda expression is, basically, an anonymous (unnamed) method.
- But, a lambda expression cannot be executed on its own, we need to implement a
method defined in a Functional interface.
- They are also called `closures`.
- Lambda Operator or the Arrow Operator: -> 
- On the left-hand side of the arrow (lambda) operator, we will have a parameter to the 
anonymous method.
- On the right-hand side of the arrow, we will have the body of the anonymous method.
- General Form: <parameter(s)> -> <method body>
- A lambda expression can have two types of method bodies
1. A single expression
2. A block of code enclosed in a set of curly braces.
```
Expression Lambda
1. () -> 1234.5
public double method() {
    return 1234.5;
}
---
2. () -> Math.random() * 100.0
public void double createRandomNumber() {
    return Math.random() * 100.0
}
---
3. (number) -> (number % 2 == 0)
public boolean checkIfNumberIsEven(int number) {
    return number % 2 == 0;
}
```
- Some common Functional Interfaces for Lambda Expressions in JDK
1. UnaryOperator
2. BinaryOperator
3. Consumer
4. Supplier
5. Function
6. Predicate












