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
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode temp  = head;
        ListNode temp1  = head.next;
        while(temp!=temp1){
            if(temp1==null || temp1.next==null){
                return false;
            }
            temp= temp.next;
            temp1 = temp1.next.next;
        }

        return true;
        
        
    }
}