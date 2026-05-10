package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
  @Test

  void TestAddBalance(){
    Account a11 = new Account();
    Assertions.assertEquals(1000, a11.getBalance());
    a11.addBalance(200);
    Assertions.assertEquals(1200, a11.getBalance());
  }

  @Test
  void TestdeductBalance(){
    Account a11 = new Account();
    Assertions.assertEquals(1000, a11.getBalance());
    a11.deductBalance(150);
    Assertions.assertEquals(850, a11.getBalance());

    Assertions.assertThrows(RuntimeException.class,()-> a11.deductBalance(900));
  }
  

 






  
}
