package com.bootcamp.demo;

import java.math.BigDecimal;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


//Serverless
// AWS Lambda (upload jar) --> run Java application 

//Java Lambda
public class DemoLambda {

  public static void main(String[] args) {
    //function (y = f(x))
    // one inpuut --> one output

    // Integer methodName (string s){} before is write as this ,, function is below writing 
    // Function Interface (one abstract method only) --> Lambda Pattern 
    //!stringLengthFunction is a local variable 
    Function< String, Integer> stringLengthFunction = s -> s.length(); // meaning s-->return s.length() , very similar Javascript
    System.out.println(stringLengthFunction.apply("hello")); //5

     //BiFunction
    BiFunction<String, String, Integer> stringLengthFunction2 = (s1,s2) -> s1.length() +s2.length();
    System.out.println(stringLengthFunction2.apply("Python", "Java")); //10

    TriFunction <Integer, Integer, Integer,Integer> sumIntegerFormula = (i1,i2,i3) -> i1 +i2+i3;
    System.out.println(sumIntegerFormula.apply(10,20,30));
    
    // Predicate
    //One input --> boolean
    int age = 67;
    Predicate <Integer> isEldelyFunction = a -> a >65;
    System.out.println(isEldelyFunction.test(age));
    System.out.println(isEldelyFunction.test(64));

    //BiPreicate
    BiPredicate <String, String> EqualsFunction = (s1, s2) -> s1 !=null && s1.equals(s2);
    System.out.println(EqualsFunction.test("Hello","Hello"));
    System.out.println(EqualsFunction.test("Hello","hello"));
    System.out.println(EqualsFunction.test("null","hello"));

    //supplier  --> no input , one output
    Supplier <Integer> randomMarksixFunction = () -> new Random().nextInt(49)+1;
    System.out.println(randomMarksixFunction.get());

    //Consumer (one input --> void = no output)
    Consumer <String> printString = s-> System.out.println(s);
    printString.accept("hello");  // use accept method


    //UnaryOperator - same as Function <String, String>
    UnaryOperator<String> upperString = s -> s.toUpperCase();
    System.out.println(upperString.apply("hello")); //HELLO

    //same as biFunction <String, String, String>
    //more than one line {}, return
    BinaryOperator<String> concatString = (s1, s2) -> {
      if(s1 == null) 
        return null;
        return s1.concat(s2);
      };
        
    System.out.println(concatString.apply("hello", "apple"));
    System.out.println(concatString.apply(null, "apple"));
    
    
    ///example math operator 
    MathOperation <Integer,Integer, Integer> suMathOperation = (i1,i2) -> (i1 +i2);
    System.out.println(suMathOperation.compute(7, 9));
    MathOperation <Integer,Integer, Integer>subtractOperation = (i1,i2) -> (i1 -i2);
    System.out.println(subtractOperation.compute(9, 7)); 
    MathOperation <Double, Double,Double >sumDoublOperation = (d1,d2) -> BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)).doubleValue();
    //return Primitive -->unbox
    System.out.println(sumDoublOperation.compute(0.1, 0.2));         
    
  }

   
  //! method --> resuseable 
  public static Integer getlength(String s){
    return s.length();
  }
  
}
