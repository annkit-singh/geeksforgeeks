### 010 Find Duplicates with constant space

 Given a number n and an array, all numbers in array will in range [0, n - 1],
 and each number will appear either once or twice, find all numbers that
 appear twice.

since all numbers are within [0, n - 1], we take advance the index. First time we see a number, we will set nums[number] as negative. And next time we see it, if nums[number] is negative, we know it is a duplicates!

For example, `int[] nums = {1, 2, 2, 3, 4}`

- Step 1:
 
    ```plain
    i = 0, number = nums[i] = 1,
    so we check if nums[number] < 0 or not, nums[number] = 2, which is not negative, so we set it as -2 to denote we have seen nums[number]
    now nums = {1, -2, 2, 3, 4}
    ```
- Step 2: 

    ```plain
    i = 1, number = abs(nums[i]) = 2 // since this number may be set negative before
    we check nums[number] < 0 or not
    now nums = {1, -2, -2, 3, 4}
    ```

- Step 3:

    ```plain
    i = 2, number = abs(nums[i] = 2),
    we check nums[number] < 0 or not, and it is! which means we have seen this number before, we we know this number is a duplicate
    duplicate = number
    ```