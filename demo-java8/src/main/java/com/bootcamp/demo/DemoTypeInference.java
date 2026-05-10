package com.bootcamp.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DemoTypeInference {
//! Wrong Syntax
//1. Attribute Type 
//   var name;
//2. method input pararmeter
//3. method return 

  public static void main(String[] args) {
    // Java 10
    var x = 3; // meaning int x = 3
    x= x + 10;
    System.out.println(x);

    var y = "hello";
    System.out.println(y.charAt(0));

    //BigDecimal
    var bf = BigDecimal.valueOf(130);
    //Local date
    var ld = LocalDate.of(2026, 1, 1);
    //Dog
    var dog = new Dog();

    //! cannot reassign another Type of value into original variable double 
    // x = 10.3; <-- var --> deterine the type by value , already define as int type. 

  }
  
}
