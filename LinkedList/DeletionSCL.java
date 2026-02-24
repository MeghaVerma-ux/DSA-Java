public class DeletionSCL {

  Node head;
  class Node {
    int data;
    Node next;

    Node(data){
      this.data = data;
      this.next = null;
    }
  }

  public void deleteAtBeginning(){

    if(head == null){
      return;
    }

    if(head.next = head){
      head = null;
      return;
    }

    Node temp = head;

    while(temp.next != head){
      temp = temp.next;
    }

    head = head.next;
    temp.next = head;
  }

  public void deleteAtEnd(){

    if(head == null){
      return;
    }

    if(head.next = head){
      head = null;
      return;
    }

    Node temp = head;
    while(temp.next.next != head){
      temp = temp.next;
    }

    temp.next = head;
  }

  public void deleteAtPosition(int position){

    if(head == null){
      return;
    }

    if(position == 1){
      deleteAtBeginning();
      return;
    }

    Node temp = head;

    for(int i = 1; i < position - 1 && temp.next != head; i++){
      temp = temp.next;
    }

    temp.next = temp.next.next;
  }

  public void display(){

    Node temp = head;

    while(temp != head){
      System.out.println(temp.data + "->");
      temp = temp.next;
    }

    System.out.println("back to head");
  }

  public static void main(String[] args){

    DeletionSCL list = new DeletionSCL();
    list.deleteAtBeginning();

    list.deleteAtEnd();

    list.deleteAtPosition(4);

    list.display();

  
  }
}
