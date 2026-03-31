public class PrimitiveMath {
  public static void main (String[]args){
    int count = 3;
    int price = 10;
    
    int total = count*price;
    System.out.println(total);

    int totalScore = 750;
    int peopleCount = 8;
    int average = totalScore/peopleCount; //suppose 93.75
    System.out.println(average);//can only show 93 because of int (integer)

    double average2 = totalScore / peopleCount;
    System.out.println(average2); //can only show 93.0

    int k = 100 + 300;
    System.out.println(k);

    k = 900;
    System.out.println(k);
    
    byte b1 = -128;
    System.out.println(b1-1);//-129

   // b1 = (b1-3); this will be error
   // System.out.println(b1);

    b1 = (byte)(b1-3);
    System.out.println(b1);//result 125 (overfloat)

    int amount = 2_100_000_000;
    amount = amount + 100_000_000;
    System.out.println(amount);//this will be overfloat again

    amount = 2_100_000_000; //reassign
    long newAmount = amount + 100_000_000L; // use long so to appear the result
    System.out.println(newAmount); 
   
    int o =10+8*4;
    System.out.println(o);

    o = (10+8)*4;
    System.out.println(o);


    

  }
}
