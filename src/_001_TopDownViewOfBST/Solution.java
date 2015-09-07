/**
 * Time : O(N) ; Space: O(N)
 * @tag : Binary Search Tree; BFS
 * @by  : Steven Cooks
 * @date: Sep 7, 2015
 ***************************************************************************
 * Description:
 * 
 * Top view of a binary tree is the set of nodes visible when the tree is 
 * viewed from the top. Given a binary tree, print the top view of it. The 
 * output nodes can be printed in any order. Expected time complexity is O(n)  
 * 
 * A node x is there in output if x is the topmost node at its horizontal 
 * distance. Horizontal distance of left child of a node x is equal to 
 * horizontal distance of x minus 1, and that of right child is horizontal 
 * distance of x plus 1.
 * 
 ***************************************************************************
 * {@link http://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/ }
 */
package _001_TopDownViewOfBST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.geeksforgeeks.TreeNode;

/** see test {@link _001_TopDownViewOfBST.SolutionTest } */
public class Solution {
    
    public List<Integer> topView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        Queue<TreeNode> nodes = new LinkedList<>();
        // horizontal offset to root
        Queue<Integer> offsets = new LinkedList<>();

        nodes.offer(root);
        offsets.offer(0);
        int left = 1;   // left boundary of tree
        int right = -1; // right boundary of tree

        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            int x = offsets.poll(); 
            if (node != null) {
                if (x < left) {
                    left = x;
                    res.add(node.val);
                } else if (x > right) {
                    right = x;
                    res.add(node.val);
                }
                nodes.offer(node.left);
                nodes.offer(node.right);
                offsets.offer(x - 1);
                offsets.offer(x + 1);
            }
        }
        return res;
    }

}
