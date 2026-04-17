// interface
// ! A Class may have multiple interfaces
public class Superman extends Human implements Flyable, Swimable { // ! Polymorphism
  // private static int attackValue = 5; // a look up value

  // ! Attributes
  private int hp; // 100
  private int attackValue;

  public Superman() {
    this.hp = 100;
    this.attackValue = 5;
  }

  public Superman(String name) {
    super(name);
    this.hp = 100;
    this.attackValue = 5;
  }

  // ! Instance Method (Skill -> Contract)
  @Override
  public void fly() {
    System.out.println(super.getName()+ "Superman is flying ...");
  }

  @Override // check if the interface contains method
  public void swim() {
    System.out.println("Superman is swimming ...");
  }

  public void sleep() {
    System.out.println("I am Sleeping...");
  }

  public boolean isAlive() {
    return this.hp > 0;
  }

  // setter (flexible)
  // public void setHp(int hp) {
  // this.hp = hp;
  // }

  // ! setHp() -> deductHp()
  public void deductHp(int toBeDeducted) {
    if (this.hp >= toBeDeducted) {
      this.hp = this.hp - toBeDeducted;
    } else {
      this.hp = 0;
    }
  }

  public int getHp() {
    return this.hp;
  }

  public void attack(Superman superman) {
    // s1 attack value
    // s2 status change
    // s1 (this), s2 (superman)
    if (this.isAlive()) {
      superman.deductHp(this.attackValue);
    } else {
      System.out.println("You die already. Cannot Attack.");
    } 
  }


  public static void main(String[] args) {
    Superman s1 = new Superman();
    s1.sleep();
    s1.fly();

    // Developer = Coding + Testing (Test Case)
    System.out.println(s1.isAlive()); // true
    s1.deductHp(80);
    System.out.println(s1.getHp()); // 20
    System.out.println(s1.isAlive()); // false

    Superman s2 = new Superman();
    
    s1.attack(s2); // 
    System.out.println(s1.getHp()); // 20
    System.out.println(s2.getHp()); // 95

    // s1 attack s2
    // Superman attack Superman (Verb -> method)
    // Status Change (s2) -> s2 has method to change status (deductHp)
    // 

 


    Superman s3 = new Superman();
    s3.setName("Amy");
    System.out.println(s3.getName());


  // ! Dynamic Polymorphism (多態)
    Superman s4 = new Superman();
    // Parent Class can be the Object Reference Type
    Human h1 = new Superman();
    // ! Compile time, h1 can call Parent Class Method ONLY
    // ! Object Reference Type decided what you can call.
    // h1.fly();
    // h1.swim(); <--failed becoz Compile time already show can only call parent method
    System.out.println(h1.getName()); //
    h1.setName("John");
    // ! h1係指針, Runtime, h1 will know it points to Superman object
    // Superman s5 = new Human(); // but cannot reverse


    // Two Types of Polymorphism
    // ! Static Polymorphism
    // call methodName(int x, int y), methodName(double x, double y)
    String.valueOf(true); // "true"
    String.valueOf(new char[] {'a', 'b'}); // "ab"

    // ! Dynamic Polymorphism (Runtime decide method content)
    // h1 -> Superman Object (getName) or Student Object (getName)

    // ! Polymorphism: interface
    Flyable f = new Superman("Leo");
    f.fly(); // runtime -> fly() method content
    // Superman is flying ...
    // f.swim();

    Swimable s = new Superman("Jason");
    s.swim();
    // Superman is swimming ...
    // s.fly();

    Flyable[] flys = new Flyable[] {new Bird(), new Superman("Susan"), new Superman("Hugo")};
    for (int i = 0; i < flys.length; i++) {
      flys[i].fly();
    }

  }
}

