### [014] Find Leftmost One in Matrix

Given a 2D array, which only contains number 0 or 1, and in each row, if one
position is 1, and all elements from this position to the end of this row are 1.
Please find the leftmost column which contains at least one 1.

1. brutal force: O(m * n), check every position from left top to right bottom

2. binary search `O(m * lgn)`
    
    Do binary on columns， try to find 1 in the middle column, if we find, we go to left part to search; otherwise, we go to right part to search

3. best O(m + n)

    Started at (0, cols-1), find 1 in the column, and move as left as possible


