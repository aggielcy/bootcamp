package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


  //Maven(java) + Gradle (Java, React)

  //! write test case first before main code (TDD = Test Driven Design , 
  // ! 2 ppl do, one main, one test)
  //if 0 to 1, a lot of class, better have test case, even you start with rDD =request driven design
  
public class CalculatorTest {
  @Test

  void testCalculator(){
    Calculator c1 = new Calculator(7, 8);
    Assertions.assertEquals(15, c1.sum());
    c1.setX(-5);
    Assertions.assertEquals(3, c1.sum());
    c1.setY(100);
    Assertions.assertEquals(95, c1.sum());







  }
  
}
