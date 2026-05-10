import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {

  public static void main(String[] args) {
    Deque<String>dq = new ArrayDeque<>(); // can LinkedList or ArrayDeque (how to do)
    //Queue vs Deque
    //1. Queue (add Last and poll first)
    //2. Deque (add Last/First and poll First/Last) = pine

    //Queue: add + poll
    //Deque: add + poll or pop + push

    //add + poll is a set
    dq.addLast("Leo");
    dq.addFirst("Peter");
    System.out.println(dq.pollLast()); // Leo
    dq.addLast("Ellen");
    dq.addFirst("Steven");
    System.out.println(dq.pollFirst()); //Steven

    System.out.println(dq.contains("Peter"));//true
    System.out.println(dq.peekFirst());
    System.out.println(dq.peekLast());
    

    while(dq.size()>=2){
      System.out.println(dq.pollFirst());
      System.out.println(dq.pollLast());
    }


    //pop +push is a set (CUP concept)
    dq.push("Kelly");
    dq.push("Oscar");
    dq.push("Jenny");
    
    System.out.println(dq.pop()); //Jenny
    System.out.println(dq.pop()); // Oscar
    System.out.println(dq.pop()); //Kelly

    // LinkedList (Queue vs Deque)
    Queue <Integer> queue1 = new LinkedList<>();
    queue1.add(10);
    queue1.add(20);
    //Queue cannot use below
    Deque <Integer> queue2 = new LinkedList<>();
    queue2.addFirst(10);
    queue2.addLast(20);
    queue2.pollLast();
    queue2.pollFirst();

    queue2.push(100);
    queue2.pop();







    




  }
  
}
