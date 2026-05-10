package com.bootcamp.demo;



public class DemoSwitchExpression {
  public static enum Color{
    RED, BLUE, BLACK,;
  }

  public static void main(String[] args) {
    //Java 14 (Lambda -> Switch)

    Color color = Color.BLUE;

    //Switch
    switch (color){   //switch ->null->throw NPE
      case RED:
        System.out.println("it is red");
        break;
      case BLUE:
        System.out.println("it is blue");
        break;
      case BLACK:
        System.out.println("it is black");
        break;
      default:
        System.out.println("default");
        break;
    }

    //Switch Expression, all possibility may not show
     switch (color) {
      case RED -> System.out.println("it is red");
      case BLUE -> System.out.println("it is blue");
      case BLACK -> System.out.println("it is black");
    }



     //with return version , all possibility need to show
     //can check all possible value in enum has been written down, otherwise it is syntax error.
     String result = switch(color){
      case RED  -> {
        System.out.println("it is red");
        yield "RED.";
      }
      case BLUE  -> {
        System.out.println("it is blue"); // it is blue
        yield "BLUE.";
      }
      case BLACK  -> {
        System.out.println("it is black");
        yield "BLACK.";
      }
    } ;
    System.out.println(result);//BLUE

  }
  
}
