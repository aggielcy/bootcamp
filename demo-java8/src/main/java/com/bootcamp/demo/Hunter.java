package com.bootcamp.demo;

public class Hunter {
  private Gun gun; 
  private boolean isAlive;

  // !All Argument constructor
  // dependency injection
  public Hunter (Gun gun){
    if(gun ==null)
      throw new IllegalArgumentException("Gun must be ready.");
    this.gun = gun;
    this.isAlive = true;
  }

  public boolean isAlive(){
    return this.isAlive;
  }

  public void dead(){
    this.isAlive = false;
  }



  public void shoot(Hunter hunter){
    try{
      this.gun.shoot();
      hunter.dead();
    } catch (RuntimeException e){
      return;
    }  
 }

  public boolean addBullet(){
    return this.gun.addBullet();
  }

 

public static void main(String[] args) {
  Hunter h1 = new Hunter (new Gun());
  Hunter h2 = new Hunter (new Gun());

  h1.addBullet();
  h1.shoot(h2);

  System.out.println(h1.isAlive());
  System.out.println(h2.isAlive());
}



  
}
