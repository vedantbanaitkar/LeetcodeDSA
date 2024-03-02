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
    public static int n(ListNode head){
        int k = 0;
        ListNode curr = head;
        while(curr!=null){
            curr=curr.next;
            k++;
        }
        return k;
    }
    public ListNode middleNode(ListNode head) {
        int l = n(head);
        l = (l/2)+1;
        ListNode curr = head;
        int k = 1;
        while(curr!=null){
            if(k==l){
                return curr;
            }
            curr=curr.next;
            k++;
        }
        return null;
    }
}