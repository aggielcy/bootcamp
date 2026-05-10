package com.bootcamp.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Getter;


public class DemoOptional {

 

  private static List<Dog> dogDatabase = new ArrayList<>(List.of(new Dog("John",4),new Dog("Peter",5)));

  public static void main(String[] args) {
    //java 8:Optional
    //! the only usage of "Optional" is "return type" of method 
    // !manage the method caller and method aurthor 
    String inputName = null;
    try{
        Optional <Dog> result = searchDog(inputName);     // <-ask friend to help doing something like searching
        if(result.isPresent()){
           System.out.println(result.get());
         }else{
        System.out.println("not found.");
        }
    } catch(SearchNotFoundException e){
      System.out.println("input name cannot be empty.");

    }


    inputName = "Peter";
    try{
        Optional <Dog> result = searchDog3(inputName);     // <-ask friend to help doing something like searching
        if(result.isPresent()){
           System.out.println(result.get());
         }else{
        System.out.println("not found.");
        }
    } catch(SearchNotFoundException e){
      System.out.println("input name cannot be empty.");

    }
    
  }

  @Getter
  @AllArgsConstructor
  public static class Dog{
    private String name;
    private int age;
  }
  
  //! professional writing , need to learn, always 2 options, return something
  //! Best practise: we never return null for any scenerio. 
  public static Optional<Dog> searchDog(String dogName){
    if(dogName == null){
        throw new SearchNotFoundException("Dog Name cannot be null");
    } for (Dog dog: dogDatabase){
      if(dogName.equals(dog.getName())){
        return Optional.of(dog);
      }
    }
    //Not found , we dont want too return null, should be return and empty box carrying null
    return Optional.empty(); //new Optional (null)
  }

  //! unchecked
  public static class SearchNotFoundException extends RuntimeException{     //<- extends runtimeexception so that we can try/catch
    public SearchNotFoundException (String message){
      super(message);
    }
    //Stream 
    //Method: findFirst
    public static Optional <Dog> searchDog3(String dogName){
      if (dogName == null) {
        throw new IllegalArgumentException("Dog Name should not be null");
      }
       return dogDatabase.stream().filter(e -> dogName.equals(e.getName())).findFirst(); 
    }
    
    //!Wrong usage
    //1. Attribute Type 
    // private Optional<String> name; <--database dont know what Optional is. 
    //2. Method input Parameter, create meaningless coding

 




  }



}
