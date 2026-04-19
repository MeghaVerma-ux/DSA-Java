import java.util.Scanner;

public class TraversalBFS {

  static class Node {
    int data;
    Node left , right;

    Node(int data) {
      this.data = data;
    }
  }

  static void levelOrder(Node root) {
    if(root == null) return;

    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while(!q.isEmpty()) {
      Node curr = q.remove();
      System.out.println(q.data + " ");

      if(curr.left != null) q.add(curr.left);
      if(curr.right != null) q.add(curr.right);
    }
  }
}
