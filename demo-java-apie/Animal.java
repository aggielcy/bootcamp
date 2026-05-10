// "Animal" is an abstract description of Cat/Dog
// Object
// ! APIE: Inheritance
// Animal is a Parent Class
public abstract class Animal {   
  //abstract meaning Parent class, which we will not new an object Animal 
  // ! Common Attributes
  private String name;
  private int age;

  public Animal() {   //NoArgsConstructor , can write or skip

  }
  
  public Animal(String name, int age) {    //AllArgsConstructor , can new an object
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }
}