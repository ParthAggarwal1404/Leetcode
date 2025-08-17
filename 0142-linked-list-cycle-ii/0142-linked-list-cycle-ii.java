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
    public ListNode detectCycle(ListNode head) {
        
        if(head==null || head.next==null){
            return null;
        }
        ListNode temp= head;
        
        ListNode temp1= head;
        
        while(temp1!=null && temp1.next!=null){

            temp= temp.next;
            temp1=temp1.next.next;
            if(temp1==temp){
                ListNode ptr= head;
                while(ptr!=temp){
                    ptr= ptr.next;
                    temp = temp.next;
                }
                return ptr;
            }
        }
        
        return null;
    }
}