/**
 * Definition for singly-linked list.
 * class ListNode {
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
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        HashSet<ListNode> hs = new HashSet<>();
        while(head!=null){
            if(hs.contains(head)){
                return head;
            }
            hs.add(head);
            head = head.next;
        }
        return null;
    }
}