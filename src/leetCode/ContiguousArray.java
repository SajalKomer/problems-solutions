package leetCode;

import java.util.HashMap;
import java.util.Map;
/*
Category: prefix Sum
https://leetcode.com/problems/contiguous-array/description/
 */
public class ContiguousArray {
    public int findMaxLength(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0, count = 0;
        for (int i=0; i<nums.length; i++){
            count = count + (nums[i] == 1? 1 : -1);
            if (map.containsKey(count)){
                maxLen = Math.max(maxLen, i - map.get(count));
            }
            else {
                map.put(count, i);
            }
        }
        return maxLen;
    }
}


/**
 * Time complexity : O(n). The entire array is traversed only once.
 * Space complexity : O(n). Maximum size of the HashMap map will be n, if all the elements are either 1 or 0.
 */