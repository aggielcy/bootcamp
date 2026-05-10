package com.bootcamp.demo;

//! Java 16 Record
// 1. All arg constructor
// 2. Attribute (already final so cannot change through method)
// 3. getter (no setter)
// 4. toString
// 5.equals and hashCode

// which is very similar to lombok, but lombok need to inject but record is java own programming

public class DemoRecord {

  public static void main(String[] args) {
    Transaction t1 = new Transaction("Fund_TRAN",100);


    System.out.println(t1.type()); //Fund_TRAN
    System.out.println(t1.amount()); //100.0  amount()meaning it is private getter?

     Transaction t2 = new Transaction("Fund_TRAN",100);

     System.out.println(t1.equals(t2)); // true , meaning proved has equals
     System.out.println(t1.hashCode()==t2.hashCode()); //true, meaning has hashcode
     System.out.println(t1);//Transaction[type=Fund_TRAN, amount=100.0], meaning has toString


  }
  
}
