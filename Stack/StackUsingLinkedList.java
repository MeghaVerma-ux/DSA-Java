public class StackUsingLinkedList {

  Node top;

  static class Node{
    int data;
    Node next;

    Node(data){
      this.data = data;
      this.next = null;
    }
  }

  StackUsingLinkedList(){
    top = null;
  }

  public void push(int data){
    Node newNode = new Node(data);
    newNode.next = top;
    top = newNode;   
  }

  public int pop(){

    if(top == null){
      System.out.println("Underflow");
      return -1;
    }

    int poppedData = top.data;
    top = top.next;
    return poppedData;
    
  }

  public int peek(){

    if(top == null){
      System.out.println("Stack is empty");
      return -1;
    }

    return top.data;
  }

  public static void main(String[] args){
    StackUsingLinkedList stack = new StackUsingLinkedList();
    stack.push(10);
    stack.push(20);
    stack.push(30);

    stack.peek();
    
    stack.pop();

    stack.peek();
  }
}
