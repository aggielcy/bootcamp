import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {

    public static boolean isDuplicated (int[] arr, int newNumber){
      for (int i =0 ; i<arr.length;  i++){
        if(arr[i] == newNumber ){
          return true;
        }
        return false
      }
    }
    

    //! PI
    double pi = Math.PI;
    double radius = 3.5;
    double area = radius *radius * Math.PI;
    System.out.println(area);

    //! sqrt
    System.out.println(Math.sqrt(9)); // 3
    System.out.println(Math.sqrt(81)); // 9
    System.out.println(Math.sqrt(80)); // 8.944

    //!round
    System.out.println(Math.round(10.453)); // 10
    System.out.println(Math.round(10.453)); // 11


    //!pow to the power of 
    double result = Math.pow(2, 3); // implicit promotion , so put integer promote double
    System.out.println(result); // 2*2*2


    double bmi = 76 / Math.pow(1.76, 2);
    System.out.println(bmi);

    //!abs --> change to positive 
    int x = -2; 
    System.out.println(Math.abs(x)); // 2

    // ! Max/Min
    int[]arr = new int[]{10, 4, 8, 99,-2};
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
       max = Math.max (arr[i], max);
       }
    
    //! floor, ceil
    System.out.println(Math.floor(10.9));//10.0
    System.out.println(Math.ceil(10.1)); //11.0

    //random
     double number = Math.random(); // 0-1
     System.out.println(number); 

       int [] answers = new int [6];
       new idx = 0;
       for (int i = 0; i < 6; i++){
        int num = new Random().nextInt()+1;
        boolean found = false;
        if(int j =0 ; j<=idx; j++){
          if (answer[j] == num){
            found =true;
            break;
          }
        }
        if (found){
          continue;          
        } else {
          answer[idx++] = num;
        }
        
       }

       int num = new random ().nextIn(3);//0-2
       System.out.println(num); 
  

       Arrays.sort(answers);
      }


  }
  

