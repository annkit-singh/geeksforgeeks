/**
 * Time : O(N^2) ; Space: O(N^2)
 * @tag : Dynamic Programming
 * @by  : Steven Cooks
 * @date: Sep 14, 2015
 ***************************************************************************
 * Description:
 * 
 * Find the maximum split to break words, which means to break into as many
 * words as possible and return the max count.
 * 
 ***************************************************************************
 */
package _010_WordBreakIII;

import java.util.Set;

/** see test {@link _010_WordBreakIII.SolutionTest } */
public class Solution {

    public int maxBreak(String s, Set<String> wordDict) {
        int n = s.length();
        // dp[i] = max number of split for s[i : end]
        int[] dp = new int[n + 1];
        for (int i = s.length(); i >= 0; i--) {
            int maxCount = 0;
            if (i == s.length()) {
                // base case
                maxCount = 0;
            } else {
                // maxCount = max(count(s[i:end])
                for (int j = i + 1; j <= s.length(); j++) {
                    int count = 0;
                    String sub = s.substring(i, j);
                    if (wordDict.contains(sub)) {
                        if (j == s.length()) {
                            count = 1;
                        } else {
                            if (dp[j] > 0) {
                                count = dp[j] + 1;
                            }
                        }
                    }
                    maxCount = Math.max(maxCount, count);
                }
            }
            dp[i] = maxCount;
        }
        return dp[0];
    }

}
