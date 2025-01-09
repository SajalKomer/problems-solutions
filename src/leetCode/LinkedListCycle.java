package leetCode;

/**
 * Category: Fast and Slow Pointers (Floyd's Cycle Finding Algorithm)
 * Leetcode: https://leetcode.com/problems/linked-list-cycle/description/
 */
public class LinkedListCycle {
    // Floyd's Cycle Finding Algorithm
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }

        return false;
    }
}

/*
Complexity analysis:

Time complexity : O(n).

Space complexity : O(1).
We only use two nodes (slow and fast) so the space complexity is O(1).
 */

/**********************************************/

/*

//Brute Force: using HashMap

public boolean hasCycle(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (nodesSeen.contains(current)) {
                return true;
            }
            nodesSeen.add(current);
            current = current.next;
        }
        return false;
    }

// Complexity analysis:
// Time complexity : O(n).
// Space complexity: O(n).
 */
