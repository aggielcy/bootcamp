public class JavaExercise7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Sum up all odd number between 0 - 50
    
   int odd = 0; 
   int sumOdd = 0;
    for (int i = 0; i <51; i++){
      if(i % 2 != 0){
        sumOdd += i;
      } 
    }
    System.out.println("the sum is " + sumOdd);



    // System.out.println("The sum is " + sum);
  }
}