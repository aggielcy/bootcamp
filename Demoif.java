public class DemoIf {
  public static void main(String[] args) {
    // if
    int age = 13;

    if (age >= 18) {
      System.out.println("hello");
    }

    // >, <, >=, <=
    if (age >= 18) { // because age is 13, so the result is false, go to else code block
      System.out.println("adult");
    } else {
      System.out.println("child"); // print
    }

    // 8 Primitives + String
    // boolean
    // = (assignment)
    // == (check if equals)
    age = 70;

    if (age > 65) {
      System.out.println("Fee=2");
    }

    boolean isElderly = age > 65; // true

    if (isElderly) {
      System.out.println("Fee=2");
    }

    if (isElderly == true) {
      System.out.println("Fee=2");
    }

    // && (AND) || (OR)
    int a = 18;
    // 2 conditions (fulfill at the same time)
    if (a >= 5 && a <= 20) {
      System.out.println("a is between 5 and 20.");
    }
    // Fulfill one of the conditions
    // ! or -> be careful to use else.
    if (a >= 5 || a <= 20) {
      System.out.println("a is either >= 5 or <= 20");
    }

    int b = 10;
    if (a > 20 || b > 12) {
      System.out.println("hello");
    } else {
      System.out.println("goodbye");
    }

    // Event 1: a > 20 -> false
    // Event 2: b > 6 && b < 20 -> true
    if (a > 20 || b > 6 && b < 20) {
      System.out.println("correct.");
    }

    // Swap
    int x = 9;
    int y = 5;
    int temp = x; // x -> backup
    x = y;
    y = temp;
    System.out.println(x);
    System.out.println(y);

    // Find max between 2 numbers
    int j = 10;
    int k = 5;
    // 10
    int max = k;
    if (j > k) {
      max = j;
    } else {
      max = k;
    }
    System.out.println(max);

    // Find min between 3 numbers
    int q = 8;
    int u = 10;
    int t = 2;

    int min;
    if (q < u) {
      if (q < t) {
        min = q;
      } else {
        min = t;
      }
    } else {
      if (u < t) {
        min = u;
      } else {
        min = t;
      }
    }

    // min
    System.out.println("min=" + min);


    // double, char, String (Comparsion)
    // String -> methods
    int score = 78;
    // >= 90 Grade A
    // >= 80 and < 90 Grade B
    // >= 70 and < 80 Grade C
    char grade = 'F';
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    }
    // Grade A or Grade B -> Print Excellent
    // Grade C -> Print Pass
    if (grade == 'A' || grade == 'B') {
      System.out.println("Excellent.");
    } else if (grade == 'C') {
      System.out.println("Pass.");
    }

    String s1 = "Java";
    // check if s1 starts with J or s1 length > 5 -> print hello
    // othewise -> print byebye

    if (s1.charAt(0) == 'J' || s1.length() > 5) {
      System.out.println("hello");
    } else {
      System.out.println("byebye");
    }

    // Switch
    // 1. AND OR
    // 2. Range checking
    // 3. break
    char gender = 'M';
    switch (gender) {
      case 'M':
        System.out.println("He is a male.");
        // break;
      case 'F':
        System.out.println("She is a female.");
        // break;
      default:
        System.out.println("Invalid Gender.");
    }

    int mark = 92;
    char grade2 = 'A';
    switch (mark) {
      case 90:
        grade2 = 'A';
        break;
      case 91:
        grade2 = 'A';
        break;
      case 92:
        grade2 = 'A';
        break;
      // ...
    }

    // Divisible by 4: Generally, any year divisible by 4 is a leap year (e.g., 2024, 2028).

    // Century Exception: If a year is divisible by 100, it is not a leap year (e.g., 1700, 1800, 1900).

    // 400 Rule: If a year is divisible by 100 but also divisible by 400, it is a leap year (e.g., 1600,
    // 2000).

    int year = 2100;
    // it is a leap year.
    // it is not a leap year.
    boolean isLeapYear = false;
    
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          isLeapYear = true;
        } else {
          isLeapYear = false;
        }
      } else {
        isLeapYear = true;
      }
    } else {
      isLeapYear = false;
    }

    if (isLeapYear) {
      System.out.println("it is a leap year.");
    } else {
      System.out.println("it is not a leap year.");
    }

    // != -> not equals to
    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
      System.out.println("it is a leap year.");
    } else {
      System.out.println("it is not a leap year.");
    }

    

  }
}