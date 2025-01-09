package leetCode;

/**
 * Category: Two pointers
 * Leetcode: https://leetcode.com/problems/container-with-most-water/description/
 */
public class ContainerWithMostWater {

    public int maxArea(int [] height){
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int max = 0;
        while (leftIndex < rightIndex){
            int maxHeight = Math.min(height[leftIndex], height[rightIndex]);
            int currentArea = maxHeight * (rightIndex - leftIndex);
            max = Math.max(currentArea, max);
            if (height[leftIndex] == maxHeight) leftIndex++;
            else rightIndex--;
        }
        return max;
    }
}
/**
 * Complexity Analysis:
 * Time complexity: O(n). Single pass.
 * Space complexity: O(1). Constant space is used.
 */

///////////////////////////////////////////////////////////////////////////////

// Brute Force:

//    public int maxArea(int [] height){
//
//        int max = 0;
//        for (int i=0; i<height.length; i++){
//            for (int j=i+1; j<height.length; j++){
//                int area = (j-i) * (Math.min(height[i], height[j]));
//                if (area > max) max = area;
//            }
//        }
//
//        return max;
//    }


/**
 * Brute force:
 * Complexity Analysis:
 * Time complexity: O(n^2). Calculating area for all n(n−1)/2 height pairs.
 * Space complexity: O(1). Constant extra space is used.
 */
