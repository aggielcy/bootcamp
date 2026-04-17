// Java 1-21 (super first)
// Java 23-25
// super? this?

import java.math.BigDecimal;
import java.util.Objects;

public class Circle2 extends Shape {
  private double radius;

  // Child Class
  // ! Inherit Attributes & Instance Methods
  // ! Won't inherit constructors

  // public Circle() {
    //  implicitly calling parent's empty constructor
  // }

  // ! Every Child Class Constructor would call parent's constructor
  public Circle2(double radius) {
    // super(Color.BLACK); // calling Shape All Args Constructor
    super(); // calling Shape Empty Constructor
    this.radius = radius;
  }
  
  // RED Circle
  public Circle2(double radius, Color2 color) {
    super(color);
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  // area
  @Override
  public double area(){
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf (this.radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

    //! equals(radius)
    @Override
    public boolean equals(Object obj){
      if(this == obj){
        return true;
      }
      if (!(obj instanceof Circle2)){
        return false;
      }
      Circle2 c1 = (Circle2)obj;
      return c1.getRadius() == this.radius && c1.getColor() == super.getColor();
    }

    @Override
    public int hashCode(){
      return Objects.hash(this.radius, super.getColor());
    }
    



  public static void main(String[] args) {
    Circle2 c1 = new Circle2(3.5, Color2.RED);
    System.out.println(c1.getColor()); // RED
    System.out.println(c1.getRadius()); // 3.5

    System.out.println(c1.area()); //38.48451000647496


    Circle2 c2 = new Circle2(3.5, Color2.BLACK);
    
    System.out.println(c1.equals(c2)); //false   

    Circle2 c3 = new Circle2(3.5, Color2.RED);

    System.out.println(c1.equals(c3)); //true\


 





  }
}