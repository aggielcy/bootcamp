package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GunTest {
  @Test
  void GunHasBullet(){
    Gun g1 = new Gun();
    Assertions.assertEquals(0, g1.getBullet());
  }

  @Test
  void TestAddBullet(){
    Gun g1 = new Gun();
    g1.addBullet();
    Assertions.assertTrue(g1.addBullet());
    Assertions.assertEquals(1, g1.getBullet());

    Gun g2 = new Gun();
    g2.addBullet();
    g2.addBullet();
    g2.addBullet();
    g2.addBullet();
    g2.addBullet();
    g2.addBullet();
    g2.addBullet();
    Assertions.assertEquals(6, g2.getBullet());

  }

    @Test
  void TestShoot(){
    Gun g1 = new Gun();
    Assertions.assertThrows(RuntimeException.class, ()->g1.shoot());
  

    Gun g2 = new Gun();
    g2.addBullet();
    g2.shoot();
    Assertions.assertEquals(0, g2.getBullet());
  }


  
}
