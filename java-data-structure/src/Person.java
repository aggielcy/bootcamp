import java.util.Objects;

public class Person implements Comparable<Person>{
  //Comparable is java existing Class
  private int age;

  public Person(int age){
   this.age =age;
  }
  
  public int getAge(){
    return this.age;
  }

  @Override
  public int compareTo(Person person){ 
        return this.age > person.getAge()? -1:1; 
    }
    //apply override
    //<--meaning compare two person, return 1 Person = return int
    // -1 --> return this
    // 1 --> return person

    //meaning checking if this age > target age, if yes, return -1 , if not, return 1

  @Override
  public int hashCode(){
    return Objects.hash(this.age);
  }

  @Override
  public String toString(){
    return "Person("//
      +"age=" +this.age
      +")";
  }
  
}
