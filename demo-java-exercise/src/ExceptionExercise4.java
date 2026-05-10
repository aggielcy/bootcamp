import java.util.Scanner;

public class ExceptionExercise4 extends Exception{

  // Follow the instructions below to complete the User Registration Process.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    scanner.close();
    
    // code here ...
    // call method registerUser(), handle the exception to print "User Registeration is Fail."
    // or "User Registeration is Success."
    try{
      ExceptionExercise4.registerUser(username, password, email);
      System.out.println("User Registeration is Success.");
    } catch (UserRegistrationException e){
      System.out.println("User Registeration is Fail");
    }
    // try, catch
  }

  public static class UserRegistrationException extends RuntimeException {
    // code here ...
    // constructor
    public UserRegistrationException(String errorMessage){
      super(errorMessage);
    }
    
    }
  

  // Call validateUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
  public static void registerUser (String username, String password,
      String email) { // ! throws ?
    // code here ...
    try{
      validateUsername(username);
      validatePassword(password);
      validateEmail(email);
      System.out.println("User registered successfully:" + username);
    } catch(IllegalArgumentException e){
      throw new UserRegistrationException("User registration is fail" + e.getMessage()); //! take e.get message 
    }
  }

  // Throw IllegalArgumentException if String username is null or empty string
  private static void validateUsername(String username) { // ! throws?
    // code here ...
    if(username == null || username.isEmpty()){ 
      //check null must be on the left, otherwise if username null call method, will explore
      throw new IllegalArgumentException("username cannot be null or empty");
    }
    
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  private static void validatePassword(String password) {  // ! throws?
    // code here ...

    boolean isValidLength = password == null || password.length()>=8;
    boolean isWithSpecialChar = password.indexOf("!") != -1 
    ||password.indexOf("@") != -1||password.indexOf("$") != -1
    ||password.indexOf("&") != -1||password.indexOf("_") != -1;
    if(!isValidLength || !isWithSpecialChar){
      throw new IllegalArgumentException("Password Length >= 8 and with at least one speccial characters of !@$&_");
    }
    }

  // Throw IllegalArgumentException if String email is null or it does not contain character @
  private static void validateEmail(String email) {  // ! throws?
    // code here ...
    if(email == null || !email.contains("@")){
      throw new IllegalArgumentException("Invalid Email Address");
    }
  }
}