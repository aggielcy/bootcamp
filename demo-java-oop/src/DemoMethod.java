public class DemoMethod {

  //! = static (non-oop presentation)
   
    private static int daysPerYear = 365;
    private static int hoursPerDay = 24;

    public static int hourPerYear(){
      return daysPerYear * hoursPerDay;
    }

    public static void main(String[] args) {


    //1+3 --> 4
    System.out.println(sum(1,3));

    //Tool (not belong to any object)
    public static int sum (int a, int b) {
      return a + b ;
    }

    public int sum2 (int x, int y){ ///instance method = add object to call calculation
      return x + y;
    }

    DemoMethod dm = new DemoMethod();

    int sum2 = sum2 (1,3);
    System.out.println(dm.sum2(1,3));


    System.out.println(DemoMethod.hourPerYear()); //<--- using class DemoMethod inside static
 



  }
  
}
