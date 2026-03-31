public class StringDemo{
  public static void main(String[]args){
    System.out.println("hello");

    String s1= "h";
    char c1 = 'h';

    s1 = s1 + "!!!"; //string support +operation (append)
    System.out.println(s1);

    //String has methods (function)
    //1. length() --> return int
    System.out.println(s1.length());//5

    System.out.println(s1);

    //2. charAt()  --> process int return char
    String s2 = "hello";
    System.out.println(s2.charAt(3));
    System.out.println(s2.charAt(s2.length()-1));//o
  
    //3. equals() --> return boolean
    String s3 = "hello";
    System.out.println(s2.equals(s3));//true
    
    String s4 ="Hello";
    System.out.println(s3.equals(s4));//false




  }
}