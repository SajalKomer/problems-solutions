package leetCode;

/**
 * Category: Sliding Window
 * Leetcode: https://leetcode.com/problems/maximum-average-subarray-i/description/
 */
public class MaxAverageSubArrayI {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i=0; i<k; i++){
            sum += nums[i];
        }

        double res = sum;
        for (int i=k; i<nums.length; i++){
            sum += nums[i] - nums[i-k];
            res = Math.max(res, sum);
        }

        return res/k;
    }
}

/*
Complexity Analysis

Time complexity : O(n). We iterate over the given nums array of length n once only.

Space complexity : O(1). Constant extra space is used.
 */
