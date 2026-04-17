import java.math.BigDecimal;

public class Order1 {
  private String address;
  private Item1[] items;

  public Order1(){

  }
  
  public Order1(Item1[] items){
    this.items = items;
  }

  public double totalAmount(){
    BigDecimal sum = BigDecimal.ZERO;
    for (int i = 0; i < this.items.length; i++){
      Item1 items = this.items[i];
      double subTotal = items.subTotal();
      sum = sum.add(BigDecimal.valueOf(subTotal));
    }
    return sum.doubleValue();
  }
  




}
