public class SinglyLinkedList {

  Node head;

  class Node {
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public void insert(int data){
    Node newNode = new Node(data);

    if (head == null){
      head = newNode;
      return;
    }

    Node temp = head;

    while(temp != null){
      temp = temp.next;
    }
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
    SinglyLinkedList list = new SinglyLinkedList();

    list.insert(10);
    list.insert(20);
    lust.insert(30);

    list.display();
      
  }
}
