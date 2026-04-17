import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    
    //0.1 + 0.2 --> is not 0.3 in computer calculation
    System.out.println(0.1+0.2); //0.30000000000000004

    // Solution
    // new String("hello")

    // ! 1. new BigDecimal("0.1")

    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal ("0.2");
    System.out.println(bd1); // 0.1
    System.out.println(bd2); //0.2

    BigDecimal result = bd1.add(bd2);
    System.out.println(result); //0.3

    double salary = 22500.99;
    double bonus = 1500.99;
    System.out.println(salary + bonus);//24001.980000000003
    System.out.println(22500.99+1500.99); //24001.980000000003


    // ! 2. BigDecimal.valueOf, which is another ways of writing above
    BigDecimal bonus2 = BigDecimal.valueOf(1500.99);
    System.out.println(bonus2); //1500.99

    BigDecimal result2 = BigDecimal.valueOf(1500.99).add(BigDecimal.valueOf(22500.99));
    System.out.println(result2); //24001.98

    // + add
    // - subtract
    // * multiply
    // / divide

    // subtract (0.3 - 0.1) -> 0.2
    System.out.println(0.3 -0.1); //0.19999999999999998

    BigDecimal result3 = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1));
    System.out.println(result3); //0.2

    // multiply (0.1 * 0.2) -> 0.02
    System.out.println(0.1*0.2); //0.020000000000000004
    BigDecimal result4 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2));
    System.out.println(result4); //0.02

    // divide
    // 1. 10 / 3 -> 3.33333333
    // 2. rounding

    // ! Non-terminating decimal expansion
    //BigDecimal result5 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3));
    //System.out.println(result5);

    // 4捨5入 RoundingMode.HALF_UP <---the 5th module of .divide()
    BigDecimal result5 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP);
    System.out.println(result5); //3.33

    // 5捨6入 RoundingMode.HALF_DOWN
    // 6.7 / 2 --> 3.35 
    BigDecimal result6 = BigDecimal.valueOf(6.7).divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_DOWN);
    System.out.println(result6); //3.3

    BigDecimal bd3 = BigDecimal.valueOf(10.0);
    BigDecimal bd4 = BigDecimal.valueOf(0.0);

    

     // risk (Divide Zero) -> avoid   
     if (!bd4.equals(BigDecimal.valueOf(0.0))) {
      BigDecimal result7 = bd3.divide(bd4, 1, RoundingMode.HALF_DOWN);  //<--why we put BigDecimal result7 = 
      } else {
      System.out.println("Sorry, bd4 cannot be zero.");
       }
    
     //OR
      if (!bd4.equals(BigDecimal.valueOf(0.0))) {
      bd3.divide(bd4, 1, RoundingMode.HALF_DOWN); 
      } else {
      System.out.println("Sorry, bd4 cannot be zero.");
       }
     
     
      
      


  }
}
