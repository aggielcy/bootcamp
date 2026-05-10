import java.time.LocalDate;

public class Customer1 {

  private String firstname;
  private String lastname;
  private char gender;
  private LocalDate dob;
  private Order[] orders;

  private Customer1(String firstname, String lastname, char gender, LocalDate dob){
    this.firstname =firstname;
    this.lastname = lastname;
    this.gender = gender;
    this.dob = dob;
  }

  public Customer1(){
    
  }



  
}
