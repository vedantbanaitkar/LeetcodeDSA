/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(); // Dummy node to simplify the code
        ListNode current = dummy; // Current node for building the merged list

        ListNode i1 = list1;
        ListNode i2 = list2;

        while (i1 != null && i2 != null) {
            if (i1.val < i2.val) {
                current.next = i1;
                i1 = i1.next;
            } else {
                current.next = i2;
                i2 = i2.next;
            }

            current = current.next;
        }

        // If one of the lists is not fully processed, append the remaining nodes
        if (i1 != null) {
            current.next = i1;
        } else {
            current.next = i2;
        }

        return dummy.next;
    }
}