public class DemoLoop {
  public static void main(String[] args) {
    // hello
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");

    // For Loop
    // intialization -> int i = 0;
    // continue criteria -> i < 3
    // Each Iteration End -> i++

    for (int i = 0; i < 3; i++) {
      System.out.println("bye");
    }
    // Step 1: int i = 0;
    // Step 2: check if i < 3 (i = 0)
    // Step 3: print bye
    // Step 4: i++
    // Step 5: check if i < 3 (i = 1)
    // Step 6: print bye
    // Step 7: i++
    // Step 8: check if i < 3 (i = 2)
    // Step 9: print bye
    // Step 10: i++
    // Step 11: check if i < 3 (i = 3)
    // Step 12: exit loop

    // Print Even number
    for (int i = 0; i < 10; i++) { // 0 - 9
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // Print the numbers between 0 - 99, which divided by 3, and it is greater than 50
    for (int i = 0; i < 100; i++) {
      if (i > 50 && i % 3 == 0) {
        System.out.println(i);
      }
    }

    // hello
    // Find if character 'l' exists (Not use contain/ indexOf)
    String s = "hello";
    boolean isTargetExists = false;
    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i));
      if (s.charAt(i) == 'l') {
        isTargetExists = true;
        break; // break nearest loop
      }
    }
    System.out.println(isTargetExists);

    String s2 = "947852106"; // Find the largest even digit

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < s2.length(); i++) {
      int digit = s2.charAt(i) - '0'; // String -String = int
      if (digit % 2 == 0 && digit > max) {
        max = digit;
      }
    }
    System.out.println(max);

    int diff = 'd' - 'a';
    System.out.println(diff); // 3

    String s3 = "8A3ahs0nd3";
    // ahsnd
    String output = "";
    for (int i = 0; i < s3.length(); i++) {
      boolean isAlphabet = s3.charAt(i) >= 97 && s3.charAt(i) <= 122;
      if (isAlphabet) {
        output += s3.charAt(i);
      }
    }
    System.out.println(output);

    // "725094849"
    // Find the largest index of the largest digit
    // 8

    String s4 = "725094849";
    int largertDigit = Integer.MIN_VALUE;
    for (int i = 0; i < s4.length(); i++) {
      int digit2 = s4.charAt(i) - '0';
      if (digit2 > largertDigit) {
        largertDigit = digit2;
      }
    }
    System.out.println(largertDigit);
    


  }

}
