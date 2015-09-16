/**
 * Time : O(m + n) ; Space: O(1)
 * @tag : Interview; Binary Search; Matrix
 * @by  : Steven Cooks
 * @date: Sep 16, 2015
 ***************************************************************************
 * Description:
 * 
 * Given a 2D array, which only contains number 0 or 1, and in each row, if one
 * position is 1, and all elements from this position to the end of this row are 1.
 * Please find the leftmost column which contains at least one 1.
 * 
 * For example:
 *  [[0, 0, 0, 0],
 *   [0, 1, 1, 1], 
 *   [0, 0, 1, 1],
 *   [0, 0, 0, 1]]
 *
 * Result should be 1 because there is one 1 at (1,1) which is the leftmost 1.
 * Returns -1 if no 1 exists.
 * 
 * Note: try to solve it in O(m + n) time
 * 
 ***************************************************************************
 */
package _014_FindLeftMostOne;

/** see test {@link _014_FindLeftMostOne.SolutionBinarySearchTest } */
public class SolutionBinarySearch {

    // binary search version, take advantage of each row is non-descending
    public int findLeftmostOne(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return -1;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = cols - 1;
        int res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // try to find 1 in this column
            int r = 0;
            while (r < rows && matrix[r][mid] == 0) {
                r++;
            }
            if (r == rows) {
                // not found, go to right side
                left = mid + 1;
            } else {
                // go to left side
                res = mid;
                right = mid - 1;
            }
        }
        return res;
    }

}
