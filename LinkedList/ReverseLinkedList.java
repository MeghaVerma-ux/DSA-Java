public class ReverseLinkedList {

  static class Node {
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public static Node reverse(Node list){

    Node prev = null;
    Node curr = list;

    while(curr != null){

      Node next = curr.next;
      curr.next = prev;

      prev = curr;
      curr = next;
    }

    return prev;
  }

  public static void main(String[] args){

    Node list = new Node(1);
    list.next = new Node(2);
    list.next.next = new Node(3);

    Node rev = reverse(list);

    while(rev != null){
      System.out.println(rev.data + " -> ");
      rev = rev.next;
    }

    System.out.println("null");
  }
}
