public class DemoStringII {
  public static void main(String[] args) {

    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1.equals(s2)); // true

    String s3 = new String ("hello");
    String s4 = new String("hello");
    System.out.println(s1 == s2); // true
    System.out.println(s4 == s3); // false

    //== meaning it is check the same address
    //.equal() , checking the same value
    //Primitive is fine to use ==
    //class type is starting with capital letter 

    



    
  }
}