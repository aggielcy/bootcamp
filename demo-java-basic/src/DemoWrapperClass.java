public class DemoWrapperClass {
  public static void main(String[] args) {

    // Primitives (byte, short, int, long, float, double, char, boolean)
    // Wrapper Class
    
    byte b1 = 100; // primitive
    Byte b2 = 100; // Class starting with capital letter

    short s1 = 100;
    Short s2 = 100;

    // ! Always use method for comparsion
    int x1 = 100;
    Integer x2 = 100;   
    System.out.println(x2.compareTo(100)); // 0 meaning result is yes 
    System.out.println(x2.compareTo(x1)); // 0 meaning result is yes 
    System.out.println(x2.compareTo(99)); //1
    System.out.println(x2.compareTo(101)); //-1

    // Integer compareTo: 
    // left > right -> return 1
    // left < right -> return -1
    // left == right -> return 0

    if(x2.compareTo(100) > 0){
      System.out.println("larger than");
    }
    if(x2.compareTo(100) <0){
      System.out.println("smaller than");
    }
    if(x2.equals(100)){
      System.out.println("equals");      
    }
    if(!x2.equals(100)){
      System.out.println("not equal");
    }

    long l1 = 100L;
    Long l2 = 100L;

    float f1 = 9.0f;
    Float f2 = 9.0f; 
    
    double d1 = 100.99;
    Double d2 = 100.99;
    
    char ch1 = 'c';
    Character ch2 = 'c';

    if(ch2.equals('c')){         // -->use equals not compareTo
      System.out.println("equals"); // equals
    }
    if(!ch2.equals('c')){         // -->use !equals not compareTo
      System.out.println("not equals"); // equals
    }
  
    boolean o1 = true;
    Boolean o2 = true;
    //equals , not equals

    // for basic calculation Primitive
    // for system communicate save in database, more easy communicate use wrapper class

    // internal cache
    Integer k1 = 127;
    Integer k2 = 127;
    System.out.println(k1.equals(k2)); // true
    System.out.println(k1 == k2); //true (dont use)

    Integer k3 = 128;
    Integer k4 = 128;

    System.out.println(k3.equals(k4));  // true
    System.out.println(k3 == k4);  // false (dont use)

    //! = 128 to 127 (java define a range of common use object, it wont create a new object)

    // Integer is Class/Object , so comparsion need to use compareTo , equals


    //! Implicit Promotion (between Primitive)
    float f10 = 1000L;
    double d10 = 10.9f;
    float f12 = 19;
    byte b10 = 127;
    double d11 = b10; // OK (Assign byte value into double variable)
    int x10 = 'a';
    double d12 = 'a'; // OK, 97.0 because ascii value

    // ! Wrapper Class vs Primitives (auto-box / un-box)
    // ! auto-box (long -> Long)
    Long l30 = 100L; // long -> Long
    Integer i30 = 100; // int -> Integer
    Character ch30 = 'x';

    // ! un-box (Long -> long)
    long l31 = l30;
    int i31 = i30;
    char ch31 = ch30;

    // long l20 = 100; // int -> long
    // ! Java would NOT auto convert "implicit promotion" and "auto-box" at the same time
    // Long l21 = 100; // int -> long (implicit promotion) -> Long (auto-box)
    // Double d100 = 10; // int -> double -> Double

    // ! Unsafe down casting (Java disallow)
    // int x11 = d12; // ! risky (-->put double to int)
    int x11 = (int) d12; // take risk -> overflow
    System.out.println(x11); // 97



  }
}
