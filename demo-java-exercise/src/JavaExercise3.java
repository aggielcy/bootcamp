public class JavaExercise3 {
  public static void main(String[] args) {
    // Take a character and check whether it is:
    // 1. Vowel (a, e, i, o, u – both lowercase and uppercase) 97,101;105;111;117
    // 2. Consonant (anothor 21 letters), 65-97
    // 3. Not an alphabet 
    char ch = 'i';
    int asciiValue = 'i';
   
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch =='E' || ch == 'I' || ch == 'O' || ch == 'U'){
      System.out.println(ch + " is Vowel");
    } else if(asciiValue >= 65 && asciiValue <= 97){
      System.out.println(ch + " is Consonant");
    } else {
      System.out.println(ch + " Not an alphabet");
    }
      

    // Take salary and years of experience, then calculate and print bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus
    int exp = 12;
    int salary = 110_000;
    double NewSalary = salary;
  
    if(exp >= 10){
      System.out.println("Bonus is " + NewSalary * 0.2 );
    } else if (exp >= 5 && exp <10) {
      System.out.println("Bonus is " + NewSalary * 0.1 );
    } else {
      System.out.println("Bonus is " + NewSalary * 0.05 );
    }




    
    


  }
}