AVL Tree Deletion

An AVL Tree is a self-balancing Binary Search Tree where the balance factor of every node must remain:

+1
0
−1

Balance Factor:

BF = Height(Left Subtree) − Height(Right Subtree)

If the balance factor becomes +2 or −2, rotations are performed to restore balance.

Steps for AVL Deletion
1. Delete the node using BST deletion rules

There are three possible cases:

Case 1: Leaf Node

Delete the node directly.

Case 2: Node with One Child

Replace the node with its child.

Case 3: Node with Two Children

Replace the node with its Inorder Successor
(smallest element in the right subtree).

2. Update Heights

After deletion, update heights while moving upward.

3. Calculate Balance Factor

For each ancestor:

BF = Height(Left) − Height(Right)
4. Perform Rotations if Required

If BF becomes +2 or −2:

LL Case
BF = +2
Left child BF ≥ 0

→ Right Rotation

RR Case
BF = -2
Right child BF ≤ 0

→ Left Rotation

LR Case
BF = +2
Left child BF = -1

→ Left Rotation + Right Rotation

RL Case
BF = -2
Right child BF = +1

→ Right Rotation + Left Rotation

Worked Example

Initial AVL Tree:

              H
            /   \
           D     L
          / \   / \
         B   F J   N
        / \ / \    / \
       A C E G   M   O

Delete elements:

O → N → L

Step 2: Delete N

N has one child (M).

Replace N with M.

After deletion:

              H
            /   \
           D     L
          / \   / \
         B   F J   M
        / \ / \
       A C E G

Tree remains balanced.

Step 3: Delete L

L has two children.

Use Inorder Successor = M

Replace L with M and remove original M.

After deletion:

              H
            /   \
           D     M
          / \   /
         B   F J
        / \ / \
       A C E G

Balance Check
Node M
BF(M) = +1

Balanced.

Node H
BF(H) = +1

Balanced.

No rotation required.

Key Observations
  
Deletion first follows BST rules.
Heights are updated while moving upward.
Balance factors are recalculated for every ancestor.
Unlike insertion, deletion may require checking multiple ancestors up to the root.
Rotations are performed only when BF becomes +2 or −2.

Final AVL Tree
              H
            /   \
           D     M
          / \   /
         B   F J
        / \ / \
       A C E G
