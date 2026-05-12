class BST {

  class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  Node root;

  Node insert(Node root , int val){

    if(root == null) {
      return new Node(val);
    }
    if(val < root.data){
      root.left = insert(root.left , val);
    }
    else{
      root.right = insert(root.right , val);
    }

    return root;
  }

  Node delete(Node root , int val) {
    if(root == null) return null;

    if(val < root.data) {
      root.left = delete(root.left , val);
    } else if(val > root.data) {
      root.right = delete(root.right , val);
    }
    else{

      if(root.left == null && root.right == null) return null;

      if(root.right == null) return root.left;
      if(root.left == null) return root.right;

      Node successor = findMin(root.right);
      root.data = successor.data;
      root.right = delete(root.right , successor.data);
    }

    return root;
  }
}
