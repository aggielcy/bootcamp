package com.bootcamp.demo;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.bootcamp.demo.DemoStream.Person.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class DemoStream {
  public static void main(String[] args) {

    
  //Loop
  //1. for Loop
  List <String> names = new ArrayList<>(List.of("John", "Amy"));
  for(int i = 0; i < names.size(); i++){
    System.out.println(names.get(i));    //John Amy 
  }

  //2. for-each loop
   for(String name: names){
    System.out.println(name);    //John Amy 
   }

   //3. while loop
   int idx = 0;
   while(idx <names.size()){
    System.out.println(names.get(idx)); //John Amy 
    idx++;
   }

   // ! 4. stream (Java 8)
   names.stream() // Stream<String> , not arraylist, no add, etc function, use other function such as .foreach
   .forEach(name -> System.out.println(name));  //for lambda expression "->" //John Amy 
  
   // ! for loop +if --> solve 99% scenerio , now use filter 
   // filter --> =if
   names.stream().filter(name -> name.length()<=5).forEach(name -> System.out.println(name)); //send sms  John Amy

   //collect
   List<String> newNames = names.stream().filter(name->name.startsWith("J") && name.length()<=5).collect(Collectors.toList());
   System.out.println(newNames);  //[John]

// map
//! Stream map
    List<Cat> cats = names.stream() //
        .filter(name -> name.startsWith("J")) // Stream<String>
        .map(name -> new Cat(name)) // Stream<Cat>
        .collect(Collectors.toList()); // List<Cat> 

    System.out.println(cats); //[Cat(name=John)]

//! Original
    List<Cat> newCats = new ArrayList<>();
    for (String name : names) {
      if (name.startsWith("J")) {
        newCats.add(new Cat(name));  
      }
    }
    System.out.println(newCats); // [Cat(name=John)]

    // dogs = 4 Dog Objects
    List<Dog> dogs = new LinkedList<>(List.of(new Dog(10, "Steve"), new Dog(4, "Sally")
            , new Dog(20, "Tommy"), new Dog(8, "Mary"), new Dog(20, "Tommy")));
    List<Integer> dogAges = dogs.stream() //
        .map(dog -> dog.getAge()) // Stream<Integer>
        .collect(Collectors.toList()); // List<Integer>
    System.out.println(dogAges);   //  [10, 4, 20, 8]

    //sorting
    //descending order of age

    List <Dog> sortedDogs = dogs.stream()
      .sorted((d1,d2) -> d1.getAge()> d2.getAge()? -1:1)
      .collect(Collectors.toList());

    System.out.println(sortedDogs);

    
    List <Integer> sortedDogs2 = dogs.stream()
      .map(dog -> dog.getAge())  // = change the dog age to stream<Interger>
      .sorted()   //!compareTo 
      .collect(Collectors.toList());

    System.out.println(sortedDogs2); //[4, 8, 10, 20]

    //distinct (unique)
    //distinct dogs
    List <Dog> uniqueDogs = dogs.stream()
    .distinct()
    .collect(Collectors.toList());

    System.out.println(uniqueDogs); 
    //[Dog(age=10, name=Steve), Dog(age=4, name=Sally), Dog(age=20, name=Tommy), Dog(age=8, name=Mary)]
    // meaning can add repeated dog in virtual stream world and use function to distinct 
    // so that can elimulate the duplicated elements  <-can apply in this ways
    //only if we write equals in the Dog class


  
    List <String> uniqueDogs2 = dogs.stream()
    .filter(dog -> dog.getAge()>=10)
    .distinct()
    .sorted()
    .map(dog -> dog.getName())
    .collect(Collectors.toList());

     System.out.println(uniqueDogs2); 


     //flatmap
     List <Address> addresses = new ArrayList<>(new ArrayList<>(List.of(new Address("address1")
                                      ,new Address("address2"),new Address("address3"))));
      Person p1 = new Person(addresses);

      List <Address> addresses2 = new ArrayList<>(new ArrayList<>(List.of(new Address("address4")
                                      ,new Address("address5"),new Address("address6"))));
      Person p2 = new Person(addresses2);

      List<Person> persons = new ArrayList<>(List.of(p1,p2));
      List <String> allAddressesLines = persons.stream()
            .flatMap(p-> p.getAddresses().stream())
            .map (a ->a.getLine())
            .collect(Collectors.toList());

      System.out.println(allAddressesLines);

    //Stream
    Stream<String> names2 = Stream.of("John", "Peter");
    Stream <String> namesAfterFiltered = names2.filter(e -> e.length()>=5);
    List <String> finalName = namesAfterFiltered.collect(Collectors.toList());
    System.out.println(finalName);

  }

@AllArgsConstructor
@Getter
@ToString
    public static class Person{
      private List<Address> addresses;

      @AllArgsConstructor
      @Getter
      @ToString

      public static class Address{
        private String line;
      }




    }

  




  



  }

  
