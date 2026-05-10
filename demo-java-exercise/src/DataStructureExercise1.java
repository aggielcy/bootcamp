import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DataStructureExercise1 {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.  
    ArrayList<Integer> integers3 = new ArrayList<>();
    integers3.add(10);
    integers3.add(20);
    integers3.add(30);
    integers3.add(40);  
    integers3.add(50); 
    System.out.println(integers3);
    integers3.remove(3);
    System.out.println(integers3.size());//4


    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    ArrayList<String>fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Manago");
    fruits.add("Orange");
    System.out.println(fruits.contains(new String("Grapes"))); //false 


    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
    ArrayList <Integer> integers4 = new ArrayList<>();
    integers4.add(10);
    integers4.add(20);
    integers4.add(10);
    integers4.add(30);
    integers4.add(40);
    integers4.add(20);
    integers4.add(50);

    HashSet<Integer> integers5 = new HashSet<>();
    for (Integer a : integers4){
      integers5.add(a);
    }

    System.out.println(integers5);    


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
    HashSet<String> countryName = new HashSet<>();
    countryName.add("USA");
    countryName.add("India");
    countryName.add("China");
    countryName.add("Japan");
    countryName.add("Canada");
    countryName.add("India");
    System.out.println(countryName);



    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    HashSet <Double> numbers1 = new HashSet<>();
    numbers1.add(1.1);
    numbers1.add(2.2);
    numbers1.add(3.3);
    numbers1.add(4.4);
    numbers1.add(5.5);
    System.out.println(numbers1.contains(3.3));
    System.out.println(numbers1.size());


    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.

    HashSet <Integer> set1 = new HashSet<>();
    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(40);

    HashSet <Integer> set2 = new HashSet<>();
    set2.add(30);
    set2.add(40);
    set2.add(50);
    set2.add(60);

    HashSet<Integer> result =new HashSet<>();
    for (Integer a:set1){
      for (Integer b :set2){
        if(a == b){
          result.add(a);
        }
      }
    }
    System.out.println(result);
    

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    HashSet<String> names4 = new HashSet<>();
    names4.add("Cherry");
    names4.add("Steve");
    names4.add("Chole");
    names4.add("Jenny");
    names4.add ("Vicky");

    ArrayList <String> names5 = new ArrayList<>();
    for (String a : names4){
      names5.add(a);
    }

    System.out.println(names5);

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'

    ArrayList<Student>students = new ArrayList<>();
    students.add(new Student(1,"Alice"));
    students.add(new Student(2,"Bob"));
    students.add(new Student(3,"Charlie"));

    for (Student a:students){
      System.out.println(a);
    }
    
    
    students.remove(1);
    System.out.println(students);
   


    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    HashSet<Student> students1 = new HashSet<>();
    students1.add(new Student(1, "Alice"));
    students1.add(new Student(2, "Bob"));
    students1.add(new Student(3, "Charlie"));

    HashSet<Student> students2 = new HashSet<>();
    students2.add(new Student(2, "Bob"));
    students2.add(new Student(3, "Charlie"));
    students2.add(new Student(4, "David"));

    students1.retainAll(students2);

    for (Student a : students1 ){
      System.out.println(a);
    }
  
  }
}


  public static class Student {
    private int id;
    private String name;
     
    // Constructor
    // getter, setter, etc.

    public Student(int id, String name){      
      this.id = id;
      this.name =name;
  }

    public int getId(){
      return this.id;
    }

    public String getName(){
      return this.name;
    }

    public void search(int id){
      if(this.id != null){
        String x = Student.getName();
          System.out.println(x);
      }
     else System.out.println("Student not found.");
     } 
         
    
    
    @Override
    public boolean equals(Object obj){
      if(this == obj){
        return true;
      }
      if(!(obj instanceof Student)){
        return false;
      }
      Student student = (Student)obj;
      return this.name.equals(student.getName()) ;
    }

    @Override
    public int hashCode(){
      return Student.hash(this.name);
    }

    @Override
    public String toString(){
      return "Student("//
      +"id= "+ this.id
      +"name= " this.name
      +")";
    }

    
  }
  