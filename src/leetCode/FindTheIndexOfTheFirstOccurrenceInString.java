package leetCode;

public class FindTheIndexOfTheFirstOccurrenceInString {
    // My Solution
    public int strStr(String haystack, String needle) {

        int returnIndex = 0;
        int count = 0;
        for (int i=0; i<haystack.length(); i++){
            if (haystack.charAt(i) != needle.charAt(count)){
                returnIndex++;
                count = 0;
                i=returnIndex-1;
            }
            else {
                if (count == needle.length()-1){
                    return returnIndex;
                }
                count++;
            }
        }
        return -1;
    }
}
