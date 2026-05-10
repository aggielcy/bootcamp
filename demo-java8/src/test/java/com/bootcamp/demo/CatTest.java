package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Test environoment
class CatTest {  //this class is only enviroment , not really class, take out public
  @Test
  void testCat(){
    //Constructor. getter, setter
    Cat c1 = new Cat("John");
    Assertions.assertEquals("John", c1.getName());




  }

}
