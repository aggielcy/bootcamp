package com.bootcamp.demo;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
// import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
// @NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Account {
  private double balance;

  //I want to override the original empty constructor
  public Account(){
    this.balance = 1000;
  }

  public void addBalance(double amount){
    this.balance =  BigDecimal.valueOf(this.balance).add(BigDecimal.valueOf(amount)).doubleValue();
  }

  public void deductBalance(double amount){
    this.balance =  BigDecimal.valueOf(this.balance).subtract(BigDecimal.valueOf(amount)).doubleValue();
  }

    
  public static void main(String[] args) {
    Account a1 = new Account();
    Account a2 = new Account(100.9);

    System.out.println(a2.getBalance());
    a2.setBalance(9999.99);
    System.out.println(a2.getBalance());
    System.out.println(a2);

    //equals
    System.out.println(a1.equals(a2));




  }


}
