import java.math.BigDecimal;

public class Sqaure extends Shape{

  private double length;
  

  public Sqaure (double length){
    super();
    this.length = length;
  }


  public Sqaure (double length, Color2 color){
    super(color);
    this.length = length;
  }


@Override
public double area(){
  return BigDecimal.valueOf(length).multiply(BigDecimal.valueOf(length)).doubleValue();
}





}
