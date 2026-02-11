public class Insertion {

  Node head;

  class Node {
    int data;
    Node next;

    Node (int data){
      this.data = data;
      this.next = null;
    }
  }

  public void insertAtBeginning(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    return;
  }

  public void insertAtEnd(int data){
    Node newNode = new Node(data);

    if(head == null){
      head = newNode;
      return;
    }

    Node temp = head;

    while(temp != null){
      temp = temp.next;
    }
    temp.next = newNode;

  }

  public void insertAtPosition(int data, int position){
    Node newNode = new Node(data);

    if(position == 1){
      newNode.next = head;
      head = newNode;
      return;
    }

    Node temp = head;

    for(int i = 1; i < position - 1 && temp != null; i++){
      temp = temp.next;
    }

    if(temp == null){
      System.out.println("Invalid position");
    }

    newNode.next = temp.next;
    temp.next = newNode;
  }

  public void display(){
    Node temp = head;

    while(temp != null){
      System.out.println(temp.data + "- >");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args){

    Insertion list = new Insertion();

    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);

    list.insertAtBeginning(5);

    list.insertAtPosition(25 , 4);

    list.display();

    
  }
}
