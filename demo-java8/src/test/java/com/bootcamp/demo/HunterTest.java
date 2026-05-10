package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class HunterTest {
  @Mock
  private Gun gun;
  @Mock
  private Gun gun2;


  @Test
  void testHunterHasGun(){
    Hunter h1 = new Hunter (new Gun());
    Assertions.assertEquals(true, h1.isAlive());
  }

  @Test void addBullet(){
    //! what are we testing here?
    //Scenrio 1. gun.addBullet() return true, then return true
    Mockito.when(this.gun.addBullet()).thenReturn(true);
    Hunter h1 = new Hunter(this.gun);
    Assertions.assertEquals(true, h1.addBullet());

    //Scenrio 2. gun.addBullet() return false, then return false
    Mockito.when(this.gun.addBullet()).thenReturn(false);
    Hunter h2 = new Hunter(this.gun);
    Assertions.assertEquals(false, h2.addBullet());

  }

  @Test void shoot(){
    Hunter h1 = new Hunter(this.gun);
    Hunter h2 = new Hunter(this.gun2);

    //Scenario 1 , no Exception thrown
    h1.shoot(h2);
    Assertions.assertEquals(false, h2.isAlive());
    Assertions.assertEquals(true, h1.isAlive());


    //Scenario 2 , throw
    Mockito.doThrow(new RuntimeException()).when(this.gun).shoot();
    Hunter h3 = new Hunter(this.gun);
    Hunter h4 = new Hunter(this.gun2);
    Assertions.assertDoesNotThrow(()-> h3.shoot(h4));
    Assertions.assertTrue(h4.isAlive());


    
  }


  
}
