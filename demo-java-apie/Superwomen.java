public class Superwomen extends Human implements Drinkable {
  private int hp;
  private int attackValue;


  public Superwomen(){
    this.hp = 100;
    this.attackValue = 5;
  }
  
  @Override
  public void drink(){
    System.out.println("superwomen can drink");
  }

  public boolean isAlive(){
    return this.hp >0; 
  }
 
  public void deductHp(int tobeDeducted){
    if (this.hp >= tobeDeducted){
      this.hp = this.hp - tobeDeducted;
    } else {
      this.hp = 0;
    }
  } 
   

    public void attack (Superwomen superwomen){
      if(this.isAlive()){
      superwomen.deductHp(this.attackValue);
      } else{
        System.out.println("you are die, can't attack");
      }
    }


  



  
  public static void main(String[] args) {
    Superwomen s1 = new Superwomen();
    System.out.println(s1.hp);
    s1.drink();
    System.out.println(s1.isAlive());
    s1.deductHp(80);
    System.out.println(s1.hp);

    Superwomen s2 = new Superwomen();

    // s1 attack s2
    s1.attack(s2);




  }





}