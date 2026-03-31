public class Primitives {
  public static void main(String[]args){

    int appleCount = 100;

    double appleprice = 4.99;

    System.out.println("hello");
    System.out.println(appleCount);//100
    System.out.println(appleprice);//4.99

   // Primitive(raw data type)
   // int,byte. short, long 
   // double, float
   // boolean  <--can only type true or false
   // char <--single character, 6xxxxx, ' '

   boolean b1 = false;
   boolean isElderly = true;
   System.out.println(isElderly);

   char c1 = 'a';
   char c2 = 'i';
   char c3 = '+';
   // char c4 = 'easy';//more than one character , not ok, chinese character also ok
   char c5 = ' ';

   //Java-->integer()
   int i1;
   int i2 = 200;
   int i3 = 2100000000;
  // int i3 = 21000000000;
   int age = 13;
   
   byte by1 = 127;
   System.out.println(by1);
   //byte by2 = 128
   //System.out.println(by2) failed

   short s1 = 32767;
   short s2 = -32768;

   int k1 = 1_000_000;
   System.out.println(k1);

   double d1 = 100.99;
   double d2 = 100.99d;
   float f1 = 100.99f; 
 
   //float f2 = 100.99; failed

   int i20 = 100;
   long l20 = 200L;
   System.out.println(i20);


  }
}
