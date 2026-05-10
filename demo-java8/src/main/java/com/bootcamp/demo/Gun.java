package com.bootcamp.demo;

//!abstract
public abstract class Gun {

  private int bullet;


  public Gun (){
    this.bullet = 0;
  }

  public abstract boolean addBullet();
 

  public void shoot(){
    if(this.bullet<=0){
      throw new RuntimeException("bullet<=0");
    }
    this.bullet--;
  }

  public int getBullet(){
    return this.bullet;
  }

 public void loadBullet(){
    this.bullet++;    //<--needa add this for child class to call
 }

  
}
