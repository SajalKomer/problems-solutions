package prep;

import java.util.Arrays;
import java.util.BitSet;

//Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.
//        Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
//        Output: 5
//        Explanation: Here the size of the array is 7, so the range will be [1, 8]. The missing number between 1 to 8 is 5
public class MissingNumberInArray {

    // Function to find the missing number
    // from Geeks for Geeks
    public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }

        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }

        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }

    /**
     * A general method to find missing values from an integer array in Java.
     * This method will work even if array has more than one missing element.
     * https://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html
     */
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }

        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }

    }
    /**
     * Java method to find missing number in array of size n containing
     * numbers from 1 to n only.
     * can be used to find missing elements on integer array of
     * numbers from 1 to 100 or 1 - 1000
     */
    private static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }

        return expectedSum - actualSum;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 7, 5, 6, 2 };
        int n = arr.length;

        // Function call
        findMissing(arr, n);
    }
}
