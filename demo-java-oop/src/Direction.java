public enum Direction {
  EAST(1, "EAST"), SOUTH(2, "South"), WEST(3,"West"),NORTH(4, "North"),;
  
  private int value;
  private String desc;

  private Direction (int value, String desc){
    this.value = value;
    this.desc = desc;
  }

  public int getValue(){
    return this.value;
  }

  public String getDesc(){
    return this.desc;
  }

  public Direction oppsite(){
    for(Direction d: Direction.values()){
      if(this.value * -1 == d.getValue()){
        
      }
    }
  }



public static void main(String[] args) {
  Direction d1 = Direction.SOUTH;
  System.out.println(d1.getValue()); //2

  System.out.println(Direction.SOUTH.getDesc());
  for(Direction d: Direction.values()){    //loop num need to .value = array
    System.out.println(d.getDesc());
  }

    int [] arr = new int []{4, 9, -5};
    for (int i= 0; i< arr.length; i++){
      System.out.println(arr[i]);
    }

    for (int x : arr ){
      System.out.println(x);

    }



}

}
