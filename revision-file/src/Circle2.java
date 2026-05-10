import java.math.BigDecimal;

public class Circle2 {
  private double radius;

  public Circle2(){

  }

  public Circle2 (double radius){
    this.radius= radius;
  }

  public double area(){
    return BigDecimal.valueOf(radius)
    .multiply(BigDecimal.valueOf(radius))
    .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

  public void setRadius(double radius){
    this.radius=radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public static void main(String[] args) {
    Circle2 c1 = new Circle2(4.2);
    System.out.println(c1.area());
    c1.setRadius(5);

    System.out.println(c1.area());
    



  }

  
  
}
