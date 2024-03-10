/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 import java.util.*;
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode temp = head1;
        HashSet<ListNode> hm = new HashSet<>();
        while(temp!=null){
            hm.add(temp);
            temp = temp.next;
        }
        temp = head2;
        while(temp!=null){
            if(hm.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}