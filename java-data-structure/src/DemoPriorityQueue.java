import java.util.PriorityQueue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    //formula (e.g.age>=70) -->85/90 -->sorting
    // if you use priorityQueue, the class, e,g Person need to implement comparable into it
    PriorityQueue <Person> persons = new PriorityQueue<>();

    //the sorting only happening when .poll
    persons.add(new Person(50));
    persons.add(new Person(30));
    System.out.println(persons.poll().getAge());
    persons.add(new Person(70));
    persons.add(new Person(65));

//    while (!persons.isEmpty()) {
//      Person head = persons.poll();
//      System.out.println(head.getAge());
// }
    
    persons.add(new Person(80));


// ! comparator
    PriorityQueue<Person> dq2 = new PriorityQueue<>(new SortByAgeDesc());
    dq2.add(new Person(70));
    dq2.add(new Person(90));
    dq2.add(new Person(30));
    dq2.add(new Person(80));
    System.out.println(dq2.poll().getAge()); // 90  
    // result is using the sortbyagedesc class, which is method writing as class
    // comparator method first than Person class implements comaparable 
    System.out.println(dq2.poll().getAge()); // 80




    }



  
  }

