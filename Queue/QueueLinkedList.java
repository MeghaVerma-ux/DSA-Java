public class QueueLinkedList {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node front;
  Node rear;

  public void enqueue(int x) {

    Node newNode = new Node(x);

    if(rear == null) {
      front = rear = newNode;
      return;
    }

    rear.next = newNode;
    rear = newNode;
  }

  public int dequeue() {

    if(front == null) return -1;

    int val = front.data;
    front = front.next;

    if(front == null) {
      rear = null;
    }
    return val;
  }

  public int peek() {
    if(front == null) return -1;
    return front.data;
  }
}
