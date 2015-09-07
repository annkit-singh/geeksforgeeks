package _001_TopDownViewOfBST;

import static com.geeksforgeeks.Test.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.geeksforgeeks.TreeNode;

public class SolutionTest {
    
    /** Test method for {@link _001_TopDownViewOfBST.Solution } */
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

    //       1
    //     /   \
    //    2     3
    //   / \   / \
    //  4  5  6   7
    @Test
    public void Test1() {
        TreeNode root = TreeNode.getTree9();
        List<Integer> actual = solution.topView(root);
        List<Integer> expected = Arrays.asList(4, 2, 1, 3, 7);
        assertEqualsIgnoreOrder(expected, actual);
    }

    //   1 
    //    \
    //     2
    //      \
    //       3 
    @Test
    public void Test2() {
        TreeNode root = TreeNode.getTree1();
        List<Integer> actual = solution.topView(root);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEqualsIgnoreOrder(expected, actual);
    }

    //      1 
    //     /   
    //    2
    //   / 
    //  3 
    @Test
    public void Test3() {
        TreeNode root = TreeNode.getTree2();
        List<Integer> actual = solution.topView(root);
        List<Integer> expected = Arrays.asList(3, 2, 1);
        assertEqualsIgnoreOrder(expected, actual);
    }

    //        5
    //      /   \
    //     4     8
    //         /  \
    //       13    4
    //            / \
    //           5   1
    @Test
    public void Test4() {
        TreeNode root = TreeNode.getTree10();
        List<Integer> actual = solution.topView(root);
        List<Integer> expected = Arrays.asList(4, 5, 8, 4, 1);
        assertEqualsIgnoreOrder(expected, actual);
    }

    //     1
    //    /  \
    //   2    3
    //    \
    //     4
    //      \
    //       5
    //        \
    //          6
    @Test
    public void Test5() {
        TreeNode root = TreeNode.getTree14();
        List<Integer> actual = solution.topView(root);
        List<Integer> expected = Arrays.asList(2, 1, 3, 6);
        assertEqualsIgnoreOrder(expected, actual);
    }

}
