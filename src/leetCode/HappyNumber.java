package leetCode;

/**
 * Category: Fast & Slow Pointers (Floyd's Cycle Finding Algorithm)
 * Leetcode: https://leetcode.com/problems/happy-number/description/
 */
public class HappyNumber {
    private int getNext(int n){
        int sum = 0;
        while (n > 0){
            int d = n%10;
            n = n/10;
            sum += (d * d);
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        while (fast != 1 && slow != fast){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }

    // using HashMap
    // public boolean isHappy(int n) {
    //     Set<Integer> seen = new HashSet<>();
    //     while (n != 1 && !seen.contains(n)){
    //         seen.add(n);
    //         n = getNext(n);
    //     }
    //     return n == 1;
    // }
}

/*
Complexity Analysis:

Time complexity : O(logn).
Space complexity : O(1)
 */


/*
Complexity Analysis (using HashSet):

Time complexity : O(logn).
Space complexity : O(logn).
 */
