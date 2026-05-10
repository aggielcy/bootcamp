package com.bootcamp.demo;

public record Transaction(String type, double amount) {
  

  public static final double PI =3.14159; 
  // <--static final can write 
  //static method can written here is it is not object itself, only hang on object for use.
  // but other method (e.g. public void addAmount (){}) cannot as the element is already final, 

  }

