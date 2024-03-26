package leetCode;


public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        String shortestString = "";
        int shortestStringLength = 200;
        for (int k=0; k<strs.length; k++){
            if (strs[k].length() < shortestStringLength) {
                shortestStringLength = strs[k].length();
                shortestString = strs[k];
            }
        }

        for (int i=0; i<shortestStringLength; i++){
            char ch = shortestString.charAt(i);
            for (int j=0; j<strs.length; j++){
                if (strs[j].charAt(i) != ch) return result.toString();
            }
            result.append(ch);
        }
        return result.toString();
    }
}
