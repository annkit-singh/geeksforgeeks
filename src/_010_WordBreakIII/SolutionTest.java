package _010_WordBreakIII;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _010_WordBreakIII.Solution } */
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

    @Test
    public void Test1() {
        String s = "catsanddog";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
//        expected.add("cats and dog");
//        expected.add("cat sand dog");
        int actual = solution.maxBreak(s, wordDict);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String s = "haha";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        int actual = solution.maxBreak(s, wordDict);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String s = "catscatanddog";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        // expected.add("cats cat and dog");
        int actual = solution.maxBreak(s, wordDict);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String s = "dogcat";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("dog");
        wordDict.add("dogcat");
        // expected.add("dog cat");
        int actual = solution.maxBreak(s, wordDict);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String s = "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("a");
        wordDict.add("aa");
        wordDict.add("aaa");
        wordDict.add("aaaa");
        wordDict.add("aaaaa");
        wordDict.add("aaaaaa");
        wordDict.add("aaaaaaa");
        wordDict.add("aaaaaaaa");
        wordDict.add("aaaaaaaaa");
        wordDict.add("aaaaaaaaaa");
        int actual = solution.maxBreak(s, wordDict);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("a");
        wordDict.add("aa");
        wordDict.add("aaa");
        wordDict.add("aaaa");
        wordDict.add("aaaaa");
        wordDict.add("aaaaaa");
        wordDict.add("aaaaaaa");
        wordDict.add("aaaaaaaa");
        wordDict.add("aaaaaaaaa");
        wordDict.add("aaaaaaaaaa");
        int actual = solution.maxBreak(s, wordDict);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        String s = "baab";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("a");
        wordDict.add("aa");
        wordDict.add("ab");
        wordDict.add("b");
        wordDict.add("ba");
        // expected.add("b a a b");
        int actual = solution.maxBreak(s, wordDict);
        int expected = 4;
        assertEquals(expected, actual);
    }

}
