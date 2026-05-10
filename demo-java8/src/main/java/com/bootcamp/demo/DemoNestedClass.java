package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DemoNestedClass {

  private static final String NAME = "Jenny";

  // Inner Class, Static nested Class
  private int x;

  @Getter
  @AllArgsConstructor
  //!Inner class
  public class Ball {
    private int z;
  
    public int getValue(){
      return this.z+ x ; //! Inner class CAN access the outer class data.
    }
  }

  @Getter
  @AllArgsConstructor
  //!Static nested class
  public static class NestedClass{
    private int y;

    public int getValue(){
    //  return this.y +x; //!Static nested class CANNOT access the outer class data
    System.out.println(DemoNestedClass.NAME); //Jenny , this final static can call in here 
      return this.y;
    }
  }


  public static void main(String[] args) {
    NestedClass nc = new NestedClass(10);

    //! Create inner class object
    Ball b1 = new DemoNestedClass(20).new Ball(10); //!DemoNestedClass Object still exist in memory? 
    System.out.println(b1.getValue()); //30

    DemoNestedClass nc2 = new DemoNestedClass(30);
    Ball b2 = nc2.new Ball(100);



  }
  
}
