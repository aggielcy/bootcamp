import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>(); // the left handside now use"Queue, not LinkedList"
    // right hand side can now use Linkedlist or ArrayDeque (how to do) becoz of Queue
    // collection is also part of Polymorism , part of APIE
    queue.add("Leo");
    queue.add("Tommy");
    queue.add("Alex");

         System.out.println(queue.size()); // 3

    System.out.println(queue.peek()); // look up the head
    System.out.println(queue.remove()); // remove head

     System.out.println(queue.size()); // 2

    //! Queue --> while loop --> retrieve data
    while (!queue.isEmpty()){
      String head =  queue.poll(); // remove and get head
      System.out.println(head);
    }
    System.out.println(queue.size()); // 0

    //queue.remove(); // java.until.NosuchElementException
    queue.poll();
  }

  
}
