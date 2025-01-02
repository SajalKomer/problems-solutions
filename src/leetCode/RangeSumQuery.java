package leetCode;
/*
Category: Prefix Sum
https://leetcode.com/problems/range-sum-query-immutable/description/
 */

public class RangeSumQuery {
    private int[] prefixSumArray;

    public RangeSumQuery(int[] nums) {
        prefixSumArray = new int[nums.length];
        prefixSumArray[0] = nums[0];
        for (int i=1; i <nums.length; i++){
            prefixSumArray[i] = prefixSumArray[i-1]+nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return prefixSumArray[right];
        else
            return prefixSumArray[right] - prefixSumArray[left-1];
    }
}

/**
 * Leet Code solution:
 *
 * class NumArray {
 *
 *     private int[] prefixSumArray;
 *
 *     public NumArray(int[] nums) {
 *         prefixSumArray = new int[nums.length + 1];
 *         for (int i=0; i <nums.length; i++){
 *             prefixSumArray[i+1] = prefixSumArray[i]+nums[i];
 *         }
 *     }
 *
 *     public int sumRange(int left, int right) {
 *         return prefixSumArray[right+1] - prefixSumArray[left];
 *     }
 * }
 */

/**
 * Complexity Analysis
 *
 * Time complexity: O(1) time per query, O(n) time pre-computation.
 * Since the cumulative sum is cached, each sumRange query can be calculated in O(1) time.
 *
 * Space complexity: O(n).
 */
