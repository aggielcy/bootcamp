import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {

    int age = 10;
    int johnAge = 18;
    int maryAge = 17;

    // Array: store a set of same type values
    // Array is an unit in memory
    int[] ages = new int [3]; 
    ages [0] = age; //First Box
    ages[1] = johnAge; //Second Box
    ages[2] = maryAge; // Third Box

    // swap john and mary age (array)
    int temp = ages[1];
    ages[1] = ages[2];
    ages[2] = temp;

    System.out.println(ages[0]);
    System.out.println(ages[1]);
    System.out.println(ages[2]);

    for (int i = 0 ; i< ages.length; i++) {
      System.out.println(ages[i]);
    }
    // System.out.println(ages[0]);
    // System.out.println(ages[1]);
    // System.out.println(ages[2]);
    // System.out.println(ages[-1]); // runtime error
    // System.out.println(ages[3]); // runtime error
    System.out.println(ages.length); // 3

    // declare length 100 int array (0-99)
     int [] arr = new int [100];
     for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
     }

   // assign 100 - 199 into the array
      for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 100;
      }  
   // Two ways to declare an array (with known value set)   
     char[] chs = new char [4];
     chs [0] = 'a';
     chs [1] = 'b';
     chs [2] = 'c';
     chs [3] = 'd';

     double [] prices = new double [] {99.9, 50.3, 100.0};
     // print out all prices
     for (int i = 0; i < prices.length; i++){
      System.out.println(prices [i]);
     }
     // sum up all prices
     double totalPrice = 0.0;
      for (int i = 0; i < prices.length; i++){
      totalPrice += prices [i];
     }
     System.out.println("total Price is" + totalPrice);
     // find the min value
      double minPrice = prices [0];
     for (int i = 0; i < prices.length; i++){
      if (prices[i]< minPrice){
        minPrice = prices[i];
      }
     }
     System.out.println(minPrice);

     // find the max value

     
     char [] chs2 = new char [] { 'a','e','i','o','u'};
     String name = "Mary";
     boolean found = false;
     for (int i = 0; i < name.length(); i++){
       if (name.charAt(i) == chs2[0] || name.charAt(i) == chs2[1] ||name.charAt(i) == chs2[2] ||name.charAt(i) == chs2[3] ||name.charAt(i) == chs2[4]) {
        found = true;
        break;
        }
      }
     System.out.println(found); // true



    found = false;
    Outerloop: for (int i = 0; i<name.length(); i++){
         for (int j = 0; j< chs2.length;j++){
          if (name.charAt(i) == chs [j]);
          found = true;
          break Outerloop;
         }
      }
      System.out.println("The latest answer: " + found);

      
      int [] arr2 = new int[] {100, 4, 99, 55, 17};
       // move the first number to the tail -> 4, 99, 55, 17, 100
       // swap
      for (int i = 0; i< arr2.length - 1; i++){
        int backup = arr2[i];
        arr2[i] = arr2 [i+1];
        arr2 [i+1] = backup;
      }
      System.out.println(Arrays.toString(arr2));

       // Sorting
    // 4, 55, 17, 100, 200
    int[] arr4 = new int[] {100, 4, 200, 55, 17};
    for (int i = 0; i < arr2.length - 1; i++) { // 0,1,2,3 (How many times you move the max number)
      for (int j = 0; j < arr2.length - 1 - i; j++) { // (How many moves you need for max number)
        if (arr4[j] > arr4[j + 1]) {
          int backup = arr4[j];
          arr4[j] = arr4[j + 1];
          arr4[j + 1] = backup;
        }
      }
    }
    System.out.println(Arrays.toString(arr4));

    String str = "abcdefg";
    // reverse the string
    // gfedcba
    String reversedString = "";
    for (int i = 0; i < str.length(); i++) {
      reversedString += str.charAt(str.length() - 1 - i);
    }
    System.out.println("reversed=" + reversedString);



  }
}


