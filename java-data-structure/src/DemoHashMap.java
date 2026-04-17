import java.util.ArrayList;
import java.util.HashMap;

public class DemoHashMap {
  public static void main(String[] args) {
    
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("AAPL", "apple");
    hashMap.put("TSLA", "tesla");

    HashMap<String, Cat> hashMap2 = new HashMap<>();
    hashMap2.put("ABC", new Cat("Jason"));
    hashMap2.put("DEF", new Cat("Mandy"));

    // A HashMap has MANY entries
    // A entry has one key object and one value object
    System.out.println(hashMap.size()); //2

    //! get by KEY (hash --> search, much better than loop)
    System.out.println(hashMap.get("TSLA"));
    Cat cat = hashMap2.get("DEF");
    System.out.println(cat.getName());//Mandy

    hashMap.put("TSLA", "Trump"); //replace original value, case senitive
    System.out.println(hashMap);//{AAPL=apple, TSLA=Trump} 
    System.out.println(hashMap.size());

    System.out.println(hashMap2.get("ABC").getName()); //Jason

    HashMap<String, ArrayList<String>> hashMap3 = new HashMap<>();
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add ("apple");
    fruits.add ("orange");

    hashMap3.put("fruit", fruits);

    ArrayList<String> names = new ArrayList<>();
    names.add("Leo");
    names.add("steven");

    hashMap3.put("name", names);

    System.out.println(hashMap3);

    System.out.println(hashMap3.get("name").contains("steven"));

    //! HashMap usually basic apply is  --> Array + HashSet







  }
  
}
