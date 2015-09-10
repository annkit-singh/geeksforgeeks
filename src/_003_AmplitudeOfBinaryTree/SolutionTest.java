package _003_AmplitudeOfBinaryTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.geeksforgeeks.TreeNode;

public class SolutionTest {
    
    /** Test method for {@link _003_AmplitudeOfBinaryTree.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    //       5
    //     /   \
    //    8     9
    //   / \   / \
    //  12  2 8   4
    //       /   /
    //      2   5
    @Test
    public void Test1() {
        TreeNode n2 = new TreeNode(2);
        TreeNode n21 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n51 = new TreeNode(5);
        TreeNode n8 = new TreeNode(8);
        TreeNode n81 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);
        TreeNode n12 = new TreeNode(12);
        TreeNode.connect(n5, n8, n9);
        TreeNode.connect(n8, n12, n2);
        TreeNode.connect(n9, n81, n4);
        TreeNode.connect(n81, n21, null);
        TreeNode.connect(n4, n51, null);
        TreeNode root = n5;
        int actual = solution.amplitude(root);
        int expected = 7;
        assertEquals(expected, actual);
    }

    // 1 
    @Test
    public void Test2() {
        TreeNode root = TreeNode.getTree0();
        int actual = solution.amplitude(root);
        int expected = 0;
        assertEquals(expected, actual);
    }

    //   1 
    //    \
    //     2
    //      \
    //       3 
    @Test
    public void Test3() {
        TreeNode root = TreeNode.getTree1();
        int actual = solution.amplitude(root);
        int expected = 2;
        assertEquals(expected, actual);
    }

    //      3 
    //     /   
    //    2
    //   / 
    //  1 
    @Test
    public void Test4() {
        TreeNode root = TreeNode.getTree21();
        int actual = solution.amplitude(root);
        int expected = 2;
        assertEquals(expected, actual);
    }
    
    //      1 
    //    /   \
    //   2     3
    @Test
    public void Test5() {
        TreeNode root = TreeNode.getTree3();
        int actual = solution.amplitude(root);
        int expected = 2;
        assertEquals(expected, actual);
    }

    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \       / \
    // 7    2     5   1
    @Test
    public void Test6() {
        TreeNode root = TreeNode.getTree4();
        int actual = solution.amplitude(root);
        int expected = 9;
        assertEquals(expected, actual);
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    @Test
    public void Test7() {
        TreeNode root = TreeNode.getTree5();
        int actual = solution.amplitude(root);
        int expected = 6;
        assertEquals(expected, actual);
    }

}
