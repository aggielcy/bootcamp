public class Array2{
  public static void main(String[] args) {
    
    int age = 10;
    int johnAge = 18;
    int maryAge = 17;

    int [] ages = new int [3];
    ages [0] = age;
    ages [1] = johnAge;
    ages [2] = maryAge;

    int temp = ages [1];
    ages[1] = ages[2];
    ages [2] = temp;

    for (int i=0; i<ages.length;i++){
      System.out.println(ages[i]);
    }
    
    int [] arr = new int [100];
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }

    for (int i = 0; i < arr.length;i++ ){
      arr [i] = 100+i;
      System.out.println(arr[i]);
    }

    char[] chs = new char [4];
    chs [0] = 'a';
    chs [1] = 'b';
    chs [2] = 'c';
    chs [3] = 'd';

    double [] prices = new double[]{99.9, 50.3, 100.0};
    double totalPrice = 0.0;
    for (int i = 0; i< prices.length;i++){
       totalPrice = totalPrice + prices[i];
    }
    System.out.println(totalPrice);

    double minPrice = prices [0];
    for (int i = 0; i< prices.length; i++){
      if(prices[i] < minPrice){
        minPrice = prices[i];
      }
    } 

    System.out.println(minPrice);

    char [] chs2 = new char[]{'a','e','i','o','u'};
    String name = "Mary";
    boolean found = false;
    for (int i = 0; i < name.length();i++){
      if(name.charAt(i) == chs2[0] || name.charAt(i) == chs2[1] ||name.charAt(i) == chs2[2] || name.charAt(i) == chs2[3] ||name.charAt(i) == chs2[4] ){
        found = true;
        break;
      }
    }
      System.out.println(found);




    String str = "abcdefg";
    String reversedString = "";
    for(int i = 0 ; i < str.length();i++){
      reversedString += str.charAt(str.length()-1-i);
    }

    System.out.println(reversedString);
  }
}
