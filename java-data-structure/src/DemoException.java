import java.util.LinkedList;
import java.util.List;

public class DemoException {
  public static void main(String[] args) {

    String s = "hello";
    System.out.println(s.charAt(0));

    s=null;
  //  System.out.println(s.charAt(0)); // java.lang.NullPointerException

    if(s != null){
      System.out.println(s.charAt(0));
    } else{
      System.out.println("s is null");
    }

    String [] arr = new String [3]; // 0,1,2
    //System.out.println(arr[-1]);//java.lang.ArrayIndexOutOfBoundsException
    //System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException

    //System.out.println("hello".charAt(5));//java.lang.ArrayIndexOutOfBoundsException

    List <String> names = new LinkedList<>();
    names.add("Peter");
    names.add("Jason");
  //  System.out.println(names.get(2));//java.lang.ArrayIndexOutOfBoundsException/java.lang.Error: Unresolved compilation problems

    //Math (divided 0)
    int count = 0;
//    double average = 999/count; // java.lang.ArithmeticException


    double d1 = Double.valueOf ("24.5");
    System.out.println(d1);

    //double d2 = Double.valueOf ("24.5a");
    //System.out.println(d2); //java.lang.NumberFormatException

    
    //! TRY-CATCH
    String s4 = "100.9";
    //check if s4 is a number -->true/false
    //learn try-catch

    boolean isNumber = false;
    try{
      double d10 = Double.valueOf(s4); // if not number, throw NumberFormatException
      isNumber = true;
    } catch(NumberFormatException e){
      isNumber = false;
    }
    System.out.println("s4 is number:" + isNumber);

    //! unchecked exception (runtime exception)
    //
    //! checked exception (complie time exception)
    



    
  }
  
}
