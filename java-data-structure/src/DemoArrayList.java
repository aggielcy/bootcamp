import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
  public static void main(String[] args) {
    String [] arr = new String[3];
    arr[0] = "abc";
    arr[1] = "def";
    arr[2] = "ijk";

    
    String [] arr2 = new String [4];
    for (int i = 0; i< arr.length; i++){
      arr2 [i] = arr[i];
    }
      arr2[arr2.length-1] = "qwe";
      arr = arr2;

      System.out.println(Arrays.toString(arr));

      //Soultion
      //ArrayList --> Functionality;
      ArrayList<String> strings = new ArrayList<String>();
      strings.add("abc");
      strings.add("def");
      strings.add("ijk");
      strings.add("qwe");
      System.out.println(strings.size());
      System.out.println(strings.contains("def"));

      strings.set(1,"leo");
      System.out.println(strings);
      System.out.println(strings.getFirst());
      System.out.println(strings.getLast());
      System.out.println(strings.isEmpty());

      //equals
      ArrayList<Integer>intergers1 = new ArrayList<>();  //new java regards the format left and right should be same, so update no need to fill the right<>
      intergers1.add(100);
      intergers1.add(99);

      ArrayList<Integer>intergers2 = new ArrayList<>();
      intergers2.add(100);
      intergers2.add(99);

      System.out.println(intergers1.equals(intergers2)); // true, meaning the author ArrayList @override equals
      System.out.println(intergers1 == intergers2); //false

      System.out.println(intergers1.hashCode()); //4160
      System.out.println(intergers2.hashCode()); //4160  , hashcode same as equals , the author already override

      Integer removedItem = intergers1.remove(1); // remove the 2nd , show the 2nd item 
      System.out.println(removedItem); // 99

      boolean isRemoved = strings.remove("ijk");
      System.out.println(isRemoved); //true

      System.out.println(strings.remove("java")); //false, no item in strings to remove and show remove value

      ArrayList<String> languages = new ArrayList<>();
      languages.add("java");
      languages.add("python");

      strings.addAll(languages);
      System.out.println(strings); //[abc, leo, qwe, java, python]
      System.out.println(strings.get(3)); //java


      ArrayList<Cat> cats = new ArrayList<>(); //<>put minimun is class level, so cannot put primitive into <>
      cats.add (new Cat("John"));
      cats.add (new Cat("Mary"));
      System.out.println(cats.size());

      //"john"
      System.out.println(cats.contains(new Cat("John"))); //true , contain need to call equals

      System.out.println(cats.size());
      cats.remove(new Cat("John")); //<--remove need to call equals
      System.out.println(cats.size());  
      
      ArrayList<Character> chs = new ArrayList<>();
      chs.add('a');
      chs.add('t');
      System.out.println(chs.contains(new Character('a')));

      //for-loop (array, algorithm)
      //for each
      for(Character ch: chs){
        System.out.println(ch);
      }

      for (Cat c: cats){
        System.out.println(c.getName());
      }


      //!ArrayList --> Encapsulate Array
      // ArrayList vs Array
      //1. Array is fixed length vs ArrayList is dynamic length (= flexible length)
      //2. ArrayList & Array: get by index
      //3. ArrayList (dynamic add item) , Array (have a new array)

    
      

    
  }
  
}
