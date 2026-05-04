AVL Tree Insertion

An AVL Tree is a self-balancing Binary Search Tree where the height difference between the left and right subtree of every node is at most 1.

For every node:

Balance Factor = Height(Left Subtree) − Height(Right Subtree)

Possible balanced values:

+1 → Left subtree is taller by 1
0 → Perfectly balanced
−1 → Right subtree is taller by 1

If the balance factor becomes +2 or −2, the tree becomes unbalanced and rotations are required.

Steps for Insertion
1. Insert like a normal BST

Insert the new element according to BST rules:

Smaller → Left
Greater → Right
2. Update Heights

After insertion, move upward toward the root and update heights.

3. Calculate Balance Factor

For every node:

BF = Height(Left) − Height(Right)
4. Perform Rotation if Needed

If BF becomes +2 or −2, identify the case:

1. LL (Left Left)

Insertion path:

Node → Left → Left

Example:

    H
   /
  B
 /
A

Imbalance occurs at H.

Fix: Right Rotation

After rotation:

    B
   / \
  A   H

2. RR (Right Right)

Insertion path:

Node → Right → Right

Example:

H
 \
  I
   \
    J

Fix: Left Rotation

After rotation:

   I
  / \
 H   J

3. LR (Left Right)
  
Insertion path:

Node → Left → Right
  
Example:
      I     /    B     \      H     /    E
Fix:


Left rotation on left child


Right rotation on unbalanced node


After rotation:
      H     / \    B   I

4. RL (Right Left)
  
Insertion path:

Node → Right → Left
  
Example:
    B     \      E     /    C
  
Fix:


Right rotation on right child


Left rotation on unbalanced node


After rotation:
      C     / \    B   E

Worked Example
Inserted elements:
H, I, J, B, A, E, C, F, D, G, K, L
Final AVL Tree:
                    E                  /   \                 C     H                / \   / \               B   D F   J              /       \ / \             A         G I  K                                \                                 L

Key Observations


Insertion always follows BST rules.


Rebalancing happens while moving upward.


Only the first unbalanced ancestor needs rotation.


Rotations preserve BST ordering while maintaining balance.






