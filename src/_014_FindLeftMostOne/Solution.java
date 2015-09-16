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

/** see test {@link _014_FindLeftMostOne.SolutionTest } */
public class Solution {

    // concise version
    public int findLeftmostOne(int[][] matrix) {
        int res = -1;
        if (matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;         // current row we are in
        int col = cols - 1;  // current column we are in
        while (row < rows && col >= 0) {
            if (matrix[row][col] == 1) {
                // move left in this row
                res = col;
                col--;
            } else {
                // move down to try to find number 1
                row++;
            }
        }
        return res;
    }
    
    /**
     * Starts from top rightmost position position, find 1 in this column, and 
     * move as left as possible in the row that has 1, and then switch to next row
     * that has 1.
     */
    public int findLeftmostOne2(int[][] matrix) {
        int res = -1;
        if (matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;         // current row we are in
        int col = cols - 1;  // current column we are in
        while (col >= 0) {
            // find a row that has 1 in this column
            while (row < rows && matrix[row][col] == 0) {
                row++;
            }
            if (row == rows) {
                // no 1 can be found any more
                break;
            }

            // move as left as possible in the row `r` and update result
            while (col >= 0 && matrix[row][col] == 1) {
                res = col;  // update our result
                col--;
            }
        }
        return res;
    }

}
