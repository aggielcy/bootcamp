public class DemoSignUp {
  public static void main(String[] args) {
    String firstName = "John";
    String lastName = "Lau";

    try{
      signUp(firstName, lastName);
        System.out.println("Sign up success");
      } catch (SignUpException e){
        System.out.println("Fail to sign up"+e.getMessage());
      }
    }

    public static boolean isValidName(String name){
      for(int i = 0; i <name.length();i++){
        if(name.charAt(i)<65 || name.charAt(i) >122 ||name.charAt(i) >90 && name.charAt(i)<97){
          return false;
        } 
      } 
      return true;
    }


    public static void signUp(String firstName, String lastName){
      if (!isValidName(firstName)){
        throw new SignUpException("First Name is Invalid");
      }
      if(!isValidName(lastName)){
        throw new SignUpException("Last Name is Invalid");        
      }
    }

    public static class SignUpException extends RuntimeException{
      public SignUpException(String message){
        super(message);
      }
    }


  }
  

