import java.math.BigDecimal;

public class Circle1 {
  private double radius;

  public Circle1(){

  }


  public Circle1(double radius){
    this.radius = radius;

  }

  public double getRadius(){
    return this.radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double area(){
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(Math.PI))).doubleValue();

  }


  public static void main(String[] args) {
    Circle1 c1 = new Circle1();
    System.out.println(c1.area());
    System.out.println(new Circle1(3.5).area());

  }






}
