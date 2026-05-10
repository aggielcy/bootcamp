public class LinkedList1<T> {
  //Java Version LinkList (Double Linked)
  //Our Version LinkList (Single Linked)

    private Node <T> firstNode;

    public LinkedList1(){

  }
    public void add(T element){
      Node<T> head = this.firstNode;
      while(head.getNext()!= null){
        head = head.getNext();
      }
      head.setNext(new Node<>(element));

    }

    public static class Node<T>{
      private T element;
      private Node <T> next;



    public Node (T element){
      this.element = element;
    }

    public T getElement (){
      return this.element;
    }

    public Node<T> getNext(){
      return this.next;
    }

    public Node<T> set


    
    public static void main(String[] args) {
      LinkedList1<String> names = new LinkedList1<>();
      names.add("Leo");

    }

  }
  
}
