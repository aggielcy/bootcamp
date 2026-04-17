import java.util.LinkedList;

public class DemoLinkedList {

  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    strings.add("Leo");
    strings.add("steven");
    strings.add("Vincent");

    System.out.println(strings.size());//3
    System.out.println(strings.contains("steven")); //true
    strings.remove(1);
    System.out.println(strings.size());//2
    System.out.println(strings);

    // Create Delete update search (4 actons)
    // CRUD --> create read update delete (database)
    // ArrayList?? 

    
  }
  
}
