/**
 * Time : O(N) ; Space: O()
 * @tag : 
 * @by  : Steven Cooks
 * @date: Sep 10, 2015
 ***************************************************************************
 * Description:
 * 
 * In a binary tree T, a path P is a non-empty sequence of nodes of tree 
 * such that, each consecutive node in the sequence is a subtree of its 
 * preceding node. In the example tree, the sequences [9, 8, 2] and 
 * [5, 8, 12] are two paths, while [12, 8, 2] is not. The amplitude of path 
 * P is the maximum difference among values of nodes on path P. The amplitude 
 * of tree T is the maximum amplitude of all paths in T. When the tree is 
 * empty, it contains no path, and its amplitude is treated as 0.
 * 
 * Input:
         5
       /   \
    8        9
   /  \     /  \ 
12   2  8   4
          /    /
        2    5
 *
 * 
 ***************************************************************************
 * {@link http://www.geeksforgeeks.org/find-the-maximum-sum-path-in-a-binary-tree/ }
 */
package _003_AmplitudeOfBinaryTree;

import com.geeksforgeeks.TreeNode;

public class Solution {
    
    class ReturnType {
        private int max = 0;
        private int min = 0;
        public ReturnType(int max, int min) {
           this.max = max; 
           this.min = min;
        }
    }
    
    private int global = 0;
    
    public int amplitude(TreeNode root) {
        dfs(root);
        return global;
    }
    
    private ReturnType dfs (TreeNode root) {
        if (root == null) {
            return new ReturnType(0, 0);
        } else if (root.left == null && root.right == null) {
            return new ReturnType(root.val, root.val);
        }
        int amplitude = 0;
        int max = root.val;
        int min = root.val;
        if (root.left != null) {
            ReturnType lefts = dfs(root.left);
            int amplitude1 = Math.max(Math.abs(lefts.max - root.val), Math.abs(lefts.min - root.val));
            amplitude = Math.max(amplitude, amplitude1);
            max = Math.max(max, lefts.max);
            min = Math.min(min, lefts.min);
        }
        if (root.right != null) {
            ReturnType rights = dfs(root.right);
            int amplitude2 = Math.max(Math.abs(rights.max - root.val), Math.abs(rights.min - root.val));
            amplitude = Math.max(amplitude, amplitude2);
            max = Math.max(max, rights.max);
            min = Math.min(min, rights.min);
        }
        
        global = Math.max(global, amplitude);

        return new ReturnType(max, min);
    }

}
