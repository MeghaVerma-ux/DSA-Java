public class Deletion {

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

    if(head == null){
      System.out.println("List is empty");
      return;
    }

    head = head.next;
  }

  public void deleteAtEnd(){

    if(head == null){
      System.out.println("List is empty");
      return;
    }

    if(head.next == null){
      head = null;
      return;
    }

    Node temp = head;

   while(temp.next.next != null){
     temp = temp.next;
   }
    temp.next = null;

    
  }

  public void insertAtPosition(){

    if(head == null){
      System.out.println("List is empty");
      return;
    }

    if(position == 1){
      head = head.next;
      return;
    }

    Node temp = head;

    for(int i = 1; i < position - 1 && temp.next != null; i++){
      temp = temp.next;
    }

    if(temp.next == null){
      System.out.println("Invalid position");
      return;
    }

    temp.next = temp.next.next;

  
  }

  public void display(){

    Node temp = head;

    while(temp != null){
      System.out.println(temp.data + "- >");
      temp = temp.next;
  }

    System.out.println("null");

  


  public static void main(String[] args){

    Deletion list = new Deletion();

    list.deleteAtBeginning();
    list.deleteAtEnd();
    list.deleteAtPosition(2);

    list.display();
  }

}    

