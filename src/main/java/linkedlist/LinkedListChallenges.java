package linkedlist;

import java.util.HashSet;
import java.util.Locale;

public class LinkedListChallenges {
    public static void main(String[] args) {
        String a = "abcc";
        System.out.println("FlaG".equals("FlaG".toLowerCase()));
    }
    /**
     * reverse a linked list
     *
     */
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;

            curr = next;
        }
        head = prev;
        return head;
    }
    /**
     * Find the middle node in a linked list
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    /**
     * cycle detection in linked list and find start node of cycle
     */
    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) break;
        }
        slow = head;
        while (slow == fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
    public static ListNode detectCycleOpt(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        HashSet<ListNode> set = new HashSet<>();

        ListNode curr = head;
        while (curr != null) {
            if (set.contains(curr)) {
                break;
            }
            set.add(curr);
            curr = curr.next;
        }
        return curr;
    }

    /**
     * intersection of 2 linked lists
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = length(headA);
        int countB = length(headB);

        int d = Math.abs(countA - countB);
        ListNode currA = headA;
        ListNode currB = headB;
        int i=0;
        if (countA >= countB) {
            while (i<d && currA.next != null) {
                currA = currA.next;
                i++;
            }
        } else {
            while (i<d && currB.next != null) {
                currB = currB.next;
                i++;
            }
        }

        while (currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }

        return currA;
    }
    private int length(ListNode node) {
        int count=0;
        while (node != null) {
            node = node.next;
            count++;
        }
        return count;
    }
}
