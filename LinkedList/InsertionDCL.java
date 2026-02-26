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

    else{
      Node last = head.prev;


      newNode.next = head;
      newNode.prev = last;

      last.next = newNode;
      head.prev = newNode;

      head = newNode;
    }
    
  }

  public void insertAtEnd(int data){
    Node newNode = new Node(data);

   if(head == null){
     head = newNode;
     head.next = newNode;
     head.prev = newNode;
     return;
   } 
   else{
     Node last = head.prev;

     newNode.next = head;
     newNode.prev = last;

     last.next = newNode;
     head.prev = newNode;
   }
   
    
    

    

    
    
  }

  public void insertAtPosition(int data , int position){

    Node newNode = new Node(data);

    if(head == null){
      head = newNode;
      head.next = head;
      head.prev = head;
      head = newNode;
      return;
    }

    else if(position == 1){

      Node last = head.prev;

      newNode.next = head;
      newNode.prev = last;

      last.next = newNode;
      haed.prev = newNode;

      head = newNode;
    }

    else{

      Node temp = head;

      for(int i = 1; i < position - 1 && temp.next != head; i++){
        temp = temp.next;
      }

      if(temp.next = head){
        System.out.println("Invalid position");
        return;
      }

      newNode.next = temp.next;
      newNode.prev = temp;

      temp.next.prev = newNode;
      temp.next = newNode;
    }


    
    
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
