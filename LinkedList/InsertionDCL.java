public class InsertionDCL {

  Node head;

  class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public void insertAtBeginning(int data){
    Node newNode = new Node(data);

    if(head == null){
      head = newNode;
      head.next = head;
      head.prev = head;
      return;
    }

    Node last = head.prev;

    newNode.next = head;
    newNode.prev = last;

    last.next = newNode;
    head.prev = newNode;

    head = newNode;
  }

  public void insertAtEnd(int data){
    Node newNode = new Node(data);

    if(head == null){
      head = newNode;
      head.next = head;
      head.prev = head;
      return;
    }

    Node last = head.prev;

    

    
    
  }

  public void insertAtPosition(int data , int position){

    Node newNode = new Node(data);
    
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
    InsertionDCL list = new InsertionDCL();

    list.insertAtBeginning(20);
    list.insertAtEnd(30);
    list.insertAtPosition(70 , 4);

    list.display();
  }
}
