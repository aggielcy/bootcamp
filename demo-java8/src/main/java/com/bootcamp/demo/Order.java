package com.bootcamp.demo;

import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class Order {
  private List<Item> items;

  public Order(){
  this.items = new LinkedList<>();
}

  public boolean add (Item item){
    return this.items.add(item);
    
  }


  @AllArgsConstructor
  @Getter
  EqualsAndHashCode
  public static class Item{
    private double price;
    private int quantity;
  }

}
