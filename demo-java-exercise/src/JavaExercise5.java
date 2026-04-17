public class JavaExercise5 {
  // Sum values of an array
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';
    

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...

    for (int i = 0; i < str.length();i++) {
      if(str.contains("c")) {
        System.out.println("Found.");
        break;
      }else {
        System.out.println("Not Found.");
      }
    }

// why cannot????????

    boolean isTarget =false;

       for (int i = 0; i < str.length();i++) {
      if(isTarget == str.contains("c")) {
        System.out.println("Found.");
        break;
      }else {
        System.out.println("Not Found.");
      }break;
    }


  }
}