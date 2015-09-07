### Top Down View Of Binary Search Tree

Level order traversal of binary tree

```java
    int left = 1;   // current leftmost offset to root
    int right = -1; // current rightmost offset to root
    Queue<TreeNode> nodes;   // nodes queue
    Queue<Integer> offsets;  // parallel offset queue
    
    while (!nodes.isEmpty()) {
        node = nodes.poll();
        // if nodes not null
        if (offset < left) {
            // -> one more `stand-out` node, and update left bound
        } else if (offset > right) {
            // -> one more`stand-out` ndoe and update right bound
        }    
    }
```