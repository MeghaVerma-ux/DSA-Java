public class TraversalDFS {

  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
      this.data = data;
    }
  }

  static void preorder(Node root) {
    if(root == null) return;

    System.out.println(root.data + " ");
    preorder(root.left);
    preoredr(root.right);
  }

  static void inorder(Node root) {
    if(root == null) return;

    inorder(root.left);
    System.out.println(root.data + " ");
    inorder(root.right);
  }

  static void postorder(Node root) {
    if(root == null) return;

    postorder(root.left);
    postorder(root.right);
    System.out.println(root.data + " ");
  }
}
