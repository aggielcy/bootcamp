import src.Item;

public class Item1{

  private String name;
  private double price;
  private int quantity;

  public Item1() {

  }

  public Item1 (String name, double price, int quantity){
    this.name = name;
    this.price =price;
    this.quantity = quantity;

  }
  public double subTotal (){
    return this.price * this.quantity;
  }

  public String getName(){
    return this.name;
  }

  public double getPrice (){
    return this.price;
  }

  public int getQuantity(){
    return this.quantity;
  }
  
  public static void main(String[] args) {

     Item1 rice = new Item1 ("rice", 99.5, 2);
    Item1 water = new Item1 ("water", 5, 10);
    Item1 fish = new Item1 ("fish", 50, 4);
    System.out.println(rice.subTotal());


}
}