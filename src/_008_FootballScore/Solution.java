/**
 * Time : O(m * n) ; Space: O()
 * @tag : Backtracking
 * @by  : Steven Cooks
 * @date: Sep 13, 2015
 ***************************************************************************
 * Description:
 * 
 * The final score of one football match is m : n (m >= n). The initial score 
 * is 0 : 0, each time only one team can add its score by 1. Please find all
 * possible scores from 0 : 0 to m : n, while keeping the left part is no smaller
 * than right part.
 * 
 ***************************************************************************
 */
package _008_FootballScore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** see test {@link _008_FootballScore.SolutionTest } */
public class Solution {
    
    public List<List<Integer>> allScores(int m, int n) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= m; i++) {
            int upper = Math.min(i, n);
            for (int j = 0; j <= upper ; j++) {
                List<Integer> list = Arrays.asList(i, j);
                res.add(list);
            }
        }
        return res;
    }

}
