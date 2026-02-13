public class InsertionnDLL {
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
      return;
    }
    else{
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
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
    newNode.prev = temp;
        
  }

  public void insertAtPosition(int data, int position){
    Node newNode = new Node(data);

    if(position == 1){
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
      return;
    }

    Node temp = head;

    for(int i = 1; i < position - 1 && temp != null; i++){
      temp = temp.next;
    }

    if(temp == null){
      System.out.println("Invalid position");
      return;
    }
    
    NewNode.next = temp.next;
    newNode.prev = temp;

    if(temp.next != null){
      temp.next.prev = newNode;
    }

    temp.next = newNode;
  }
  
  
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
  InsertionnDLL list = new InsertionnDLL();

  list.insertAtBeginning(10);
  list.insertAtEnd(20);

  list.insertAtPosition(20,3);

  list.display();
}
}
  





