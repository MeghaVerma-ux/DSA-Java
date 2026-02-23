public class SCL{
  Node head;

  class Node {
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
      newNode.next = head;
      return;
    }

    Node temp = head;
    while(temp.next != head){
      temp = temp.next;
    }

    newNode.next = head;
    temp.next = newNode;
    head = newNode;
  }

  public void insertAtEnd(int data){
    Node newNode = new Node(data);

    if(head == null){
      head = newNode;
      newNode.next = head;
      return;
    }

    Node temp = head;
    while(temp.next != head){
      temp.next = newNode;
      newNode.next = head;
    }
  }

  public void insertAtPosition(int data , int position){
    Node newNode = new Node(data);

    if(position == 1){
      insertAtBeginning(data);
      return;
    }

    Node temp = head;

    for(int i = 1; i < position - 1 && temp.next != head; i++){
      temp = temp.next;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    
  }

  public void display(){
    Node temp = head;

    do{
      System.out.println(temp.data + "->");
      temp = temp.next;
    }while(temp != head);

    System.out.println("Back to head");
  }

  public static void main(String[] args){
    SCL list = new SCL();
    list.insertAtBeginning(10);
    list.insertAtEnd(30);
    list.insertAtPosition(40 , 3);

    list.display();
  }
}
