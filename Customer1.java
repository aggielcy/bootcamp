import java.math.BigDecimal;
import java.time.LocalDate;
import javax.swing.LayoutFocusTraversalPolicy;
import src.Order;

public class Customer1 {
  private String firstName;
  private String lastName;
  private char gender;
  private LocalDate dob;
  private Order[] orders;

  public Customer1(){

  }

  public Customer1(String firstName, String lastName, char gender, LocalDate dob){
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.dob = dob;
    
  }

  public Customer1(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getLastName(){
    return this.lastName;

  }
   public Customer1 (Order[]orders){
    this.orders = orders;
   }

   public double totalOrderAmount(){
    BigDecimal sum = BigDecimal.ZERO;
    for(int i = 0; i < this.orders.length; i++){
      sum = sum.add(BigDecimal.valueOf(this.orders[i].totalAmount()));
    }
    return sum.doubleValue();
   }
  

  public static void main(String[] args) {
    Customer1 c1 = new Customer1("john", "lau" , 'M' , LocalDate.of(1990,1,1));
    System.out.println(c1.getFirstName());

    Customer1 c2 = new Customer1("mary", "chan");
    System.out.println(c2.getLastName());

    Item1 rice = new Item1 ("rice", 99.5, 2);
    Item1 water = new Item1 ("water", 5, 10);
    Item1 fish = new Item1 ("fish", 50, 4);
    System.out.println(rice.subTotal());


    Item1[] items = new Item1[2];
    items[0] = rice; //199
    items[1] = water; //50

    Item1[] items2 = new Item1[1];
    items[0] = fish;

    Order1 o10 = new Order1(items);
    Order1 o11 = new Order1 (items2);
    System.out.println(o10.totalAmount());


    Customer c10 = new Customer1(orders);
    System.out.println(c10.totalOrderAmount());



  }

}




