package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Category: Sliding Window
 * Leetcode: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
public class LengthOfLongestSubstring {
    public int listOfLongestSubString(String s){
        int stringLength = s.length();
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int j=0, i=0; j<stringLength; j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            result = Math.max(result, j - i + 1);
            map.put(s.charAt(j), j+1);
        }
        return result;
    }
}

/*
Time complexity : O(2n)=O(n). In the worst case each character will be visited twice by i and j.

Space complexity : O(min(m,n)). Same as the previous approach. We need O(k) space for the sliding window,
where k is the size of the Set. The size of the Set is upper bounded by the size of the string n and the
size of the charset/alphabet m.
 */
