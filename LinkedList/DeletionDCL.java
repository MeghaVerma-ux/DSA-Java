public class DeletionDCL {

  Node head;

  class Node {
    int data;
    Node next;
    
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public void deleteAtBeginning(){

    if(head == null) return;

    if(head.next == head){
      head = null;
      return;
    }

    Node last = head.prev;

    head = head.next;

    head.prev = last;
    last.next = head;

 }

  public void deleteAtEnd(){

    if(head == null) return;

    if(head.next == head){
      head = null;
      return;
    }
    Node last = head.prev;
    Node secondLast = last.prev;

    head.prev = secondLast;
    secondLast.next = head;
    
  }

  public void deleteAtPosition(int position){

    if(head == null) return;

    if(position == 1){
      Node last = head.prev;

      head = head.next;

      last.next = head;
      head.prev = last;
    }

    Node temp = head;

    for(int i = 1; i < position && temp.next !=head; i++){
      temp = temp.next;
    }

    if(temp.next == head){
      System.out.println("Invalid position");
      return;
    }

    temp.prev.next = temp.next;
    temp.next.prev = temp.prev;
  }

  public void display(){
    Node temp = head;

    while(temp != head){
      System.out.println(temp.data + "->");
      temp = temp.next;
    }

    System.out.println("Back to head");
  }

  public static void main(String[] args){
    DeletionDCL list = new DeletionDCL();

    list.deleteAtBeginning();
    list.deleteAtEnd();
    list.deleteAtPosition(4);

    list.display();
  }
}
