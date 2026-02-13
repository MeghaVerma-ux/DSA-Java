public class DeletionDLL {
  Node head;

  class Node {
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null
    }
  }

  public void deleteAtBeginning(){

    if(head == null){
      System.out.println("List is empty");
      return;
    }

    if(head.next == null){
      head = null;
      return;
    }
    head = head.next;
    head.prev = null;
  }

  public void deleteAtEnd(){

    if(head == null){
      System.out.println("null");
      return;
    }
    if(head.next == null){
      head == null;
      return;
    }

    Node temp = head;
    
    while(temp.next != null){
      temp = temp.next;
    }

    temp.prev.next = null;
  }

  public void deleteAtPosition(int position){

    if(head == null){
      System.out.println("List is empty");
      return;
    }

    if(position == 1){
      head = head.next;
      head.prev = null;
      return;
    }


    Node temp = head;

    for(int i = 1; i < position && temp != null; i++){
      temp = temp.next;
    }
    if(temp == null){
      System.out.println("Invalid position");
      return;
    }
    if(temp.next != null){
      temp.next.prev = temp.prev;
    }
    if(temp.prev != null){
      temp.prev.next = temp.next;
    }
  }

  public void display(){

    Node temp = head;

    while(temp != null){
      System.out.println(temp.data + "⇄");
      temp = temp.next;   
    }
    System.out.println("null");
  }

  public static void main(String[] args){
    DeletionDLL list = new DeletionDLL();

    list.deleteAtBeginning();
    list.deleteAtEnd();
    list.deleteAtPosition(3);

    list.display();
  }
}
