import java.util.Scanner;

public class Dequeue {
  public static void main(String[] args) {

    Dequeue<Integer> dq = new Linked List<>();

    dq.addFirst(10);
    dq.addLast(20);
    dq.addLast(30);

    System.out.println(dq);

    dq.removeFirst();
    dq.removeLast();


    System.out.println(dq);
  }
}
