public class Bird implements Flyable {
  private String name;
  private int code; // unique

  // contructor
  public Bird() {

  }

  public Bird(String name, int code) {
    this.name = name;
    this.code = code;
  }

  @Override
  public void fly() {
    System.out.println("Bird is flying ...");
  }

  // get set
  public int getCode() {
    return this.code;
  }

  // ! b10.equals(b11);
  // b10 (this) vs b11 (obj)
  @Override
  public boolean equals(Object obj) {
    // ! Part 1: Memory Address same -> same Memory object -> same thing
    if (this == obj) {
      return true;
    }
    // ! Part 2: "instanceof" to check object vs Type
    if (!(obj instanceof Bird)) {
      return false;
    }
    // ! Part 3: Compare 2 bird objects
    Bird bird = (Bird) obj;
    return bird.getCode() == this.code; // compare Bird's code
  }

  public static void main(String[] args) {
    // ! If we do not @Override equals() -> checking object address
    Bird b1 = new Bird();
    Bird b2 = new Bird();
    System.out.println(b1.equals(b2)); // false (b1 == b2)

    // ! If we @Override equals() -> checking Bird's equals()
    Bird b3 = new Bird("John", 101);
    Bird b4 = new Bird("John", 102);
    System.out.println(b3.equals(b4)); // false

    Bird b5 = new Bird("Mary", 101);
    Bird b6 = new Bird("Sally", 101);
    System.out.println(b5.equals(b6)); // true

    Double d10 = new Double("10.0");
    Double d11 = Double.valueOf(10.0);

    System.out.println(d10.equals(d11)); // true

    // 出生Record System
    // Baby b1 = new Baby("John Chan", 65321);
    // Baby b2 = new Baby("John Chan", 65321);
    // System.out.println(b1.equals(b2)); // true

  }
}