package leetCode;

/**
 * Category: Fast and slow pointers ((Floyd's Cycle Finding Algorithm))
 * Leetcode: https://leetcode.com/problems/find-the-duplicate-number/description/
 */
public class FIndDuplicateInArray {

    public int findDuplicate(int[] nums) {
        // Phase 1: Find the intersection point of the two runners
        // (the intersection can be anywhere in the cycle. May intersect at
        // the dup but not always. So we will find the dup in the 2nd phase.).
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the "entrance" to the cycle (which is dup number).
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}

/*
Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(1)
 */
