package com.bootcamp.demo;

public class HandGun extends Gun{
  


    public boolean addBullet(){
    if(super.getBullet() >=6) //<--change fm this.bullet to super.getBullet
      return false;
     super.loadBullet(); //change from this.bullet++; to super.loadBullet()
     return true;
      
  }


  
}
