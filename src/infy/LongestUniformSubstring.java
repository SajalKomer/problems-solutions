package infy;
import java.util.LinkedHashMap;

/*
Find the longest uniform substring in a string (using integer array)
case 1> max consecutive repeating -> uniform
case2> non repeating

Test Cases :: i/p aaaabbnokpkp
o/p - aaaa
*/

public class LongestUniformSubstring {
    static void longestSubstring(String inputString) {

        char[] arr1 = inputString.toCharArray();
        String long_str = null;
        int str_length = 0;
        LinkedHashMap <Character, Integer > charPosMap = new LinkedHashMap < Character, Integer >();

        for (int i = 0; i < arr1.length; i++) {
            char ch = arr1[i];
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            } else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            if (charPosMap.size() > str_length) {
                str_length = charPosMap.size();
                long_str = charPosMap.keySet().toString();
            }
        }
        System.out.println("Input String : " + inputString);
        System.out.println("The longest substring : " + long_str);
        System.out.println("The longest Substring Length : " + str_length);
    }
    public static void main(String[] args) {
        longestSubstring("pickoutthelongestsubstring");
    }

    /*
    public static int[] repeatedSubstring(String s) {
        int[] ans = new int[]{-1, 0};
        int i = 0, j = 0;

        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                if (j-i+1 > ans[1]) {
                    ans[1] = j-i+1;
                    ans[0] = i;
                }
            }
            while (s.charAt(i) != s.charAt(j)) {
                i++;
            }
            j++;
        }
        return ans;
    }
     */
}
