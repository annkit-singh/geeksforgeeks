/**
 * Time : O() ; Space: O()
 * @tag : 
 * @by  : Steven Cooks
 * @date: Sep 20, 2015
 ***************************************************************************
 * Description:
 *
 * Find all common cities that everyone has gone to.
 * 
 * For example: 
 * 
 * Tom:  [New York, Beijing, London, Boston];
 * Jim:  [Boston, Hong Kong, London]
 * Jack: [New York, Beijing, Boston]
 * 
 * => result: [Boston]
 * 
 ***************************************************************************
 */
package _015_Intersection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** see test {@link _015_Intersection.SolutionTest } */
public class Solution {

    public Set<String> findIntersection(List<List<String>> strs) {
        Set<String> commons = new HashSet<>();
        if (strs.size() == 0) {
            return commons;
        }

        // initialize common cities
        commons = new HashSet<>(strs.get(0));

        for (List<String> cities : strs) {
            Set<String> next = new HashSet<>();
            for (String city : cities) {
                if (commons.contains(city)) {
                    next.add(city);
                }
            }
            commons = next;
        }
        return commons;
    }

}
