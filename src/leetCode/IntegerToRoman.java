package leetCode;

public class IntegerToRoman {
    private static final int [] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<values.length && num>0; i++){
            int factor = num/values[i];
            num %= values[i];
            if (factor > 0){
                for (int j = 1; j <= factor; j++) {
                    stringBuilder.append(symbols[i]);
                }
            }
        }
        return stringBuilder.toString();
    }
}

/*
Time complexity : O(1).

As there is a finite set of roman numerals, there is a hard upper limit on how many times the loop can iterate.
This upper limit is 15 times, and it occurs for the number 3888, which has a representation of MMMDCCCLXXXVIII.
Therefore, we say the time complexity is constant, i.e. O(1).

Space complexity : O(1).

The amount of memory used does not change with the size of the input integer, and is therefore constant.
 */
