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

  public void deleteAtBeginning {

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
    while(temp != null){
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

    for(){}
  }
}
