package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Categiry: Two pointers
 * Leetcode: https://leetcode.com/problems/3sum/editorial/
 *
 */
public class IIISum {

    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i<nums.length && nums[i] <= 0; i++){
            if (i == 0 || nums[i] != nums[i-1]){
                twoSumII(nums, i, res);
            }
        }
        return res;
    }

    public void twoSumII(int[] nums, int i, List<List<Integer>> res){
        int lo = i + 1, hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum < 0){
                lo++;
            } else if (sum > 0){
                hi--;
            } else {
               res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
               while (lo < hi && nums[lo] == nums[lo - 1]) lo++;
            }
        }
    }
}

/**
 * Complexity Analysis:
 *
 * Time Complexity: O(n^2). twoSumII is O(n), and we call it n times.
 * Sorting the array takes O(nlogn), so overall complexity is O(nlogn+n^2). This is asymptotically equivalent to O(n^2).
 *
 * Space Complexity: from O(logn) to O(n), depending on the implementation of the sorting algorithm.
 * For the purpose of complexity analysis, we ignore the memory required for the output.
 */
