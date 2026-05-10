package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Calculator {
  private int x;
  private int y;

  public int sum(){
    return this.x + this.y;
  }

  public int substract(){
    return -1;   //placeholder, just open for test case set up
  }
  
}
