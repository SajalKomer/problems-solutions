package leetCode;
/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9

 https://leetcode.com/problems/trapping-rain-water/description/
 */

import java.util.Stack;

public class TrappingRainWater {
    public int trap(int[] height){
        int ans = 0;
        int current = 0;
        Stack<Integer> stack = new Stack<>();

        while (current < height.length){
            while ((!stack.isEmpty()) && (height[current] > height[stack.peek()])){
                int top = stack.pop();
                if (stack.isEmpty())
                    break;

                int distance = current - stack.peek() -1;
                int boundedHeight = Math.min(height[current], height[stack.peek()]) - height[top];
                ans += distance * boundedHeight;
            }
            stack.push(current++);
        }
        return ans;
    }
}
