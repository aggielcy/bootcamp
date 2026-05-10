import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//! Arrays.sort()
//! Collections.sort() apply on List/Queue , Set will not use sort
//! collections.sort is actually merge sort , minimize the time and increase efficiency

//! Comparable (belongs to sorting object, only one)
//! Comparator (separated class define formula)

public class DemoSorting {

  public static void main(String[] args) {
    // Collection.classs --> List/Queue/Set

    //Collections
    int [] arr =new int[]{3,9,11,4,6,-3};
    Arrays.sort(arr); // Pass by reference/address
    System.out.println(Arrays.toString(arr));

    String[] arr2 = new String[]{"abc","ab","Peter","banana"};
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2));

    Person[] persons3 = new Person[]{new Person(50), new Person(30),new Person(20)};
    Arrays.sort(persons3, new SortByAgeAsc());
    System.out.println(Arrays.toString(persons3));
  

    List<Person> persons = new ArrayList<>();
    persons.add(new Person(80));
    persons.add(new Person(40));
    persons.add(new Person(20));
    persons.add(new Person(70));
    persons.add(new Person(60));

    Collections.sort(persons); //! sort(person) -->Comparable , this is to call the class if there is comparable method inside.
    System.out.println(persons);

    List<Person> persons2 = new ArrayList<>();
    persons2.add(new Person(80));
    persons2.add(new Person(40));
    persons2.add(new Person(20));
    persons2.add(new Person(70));
    persons2.add(new Person(60));

    Collections.sort(persons2, new SortByAgeAsc());
    System.out.println(persons2);
    





  }
  
}
