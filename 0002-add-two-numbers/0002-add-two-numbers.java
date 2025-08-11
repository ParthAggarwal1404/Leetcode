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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1= l1;
        ListNode ptr2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        int carry=0;
        while(ptr1!=null || ptr2 != null){
            int var1 = ptr1!=null ? ptr1.val : 0;  
            int var2 = ptr2!=null ? ptr2.val : 0;


            int sum = var1 + var2 + carry;
            carry = sum / 10;
            int d= sum%10;
            
            ListNode temp = new ListNode(d);
            dummy.next = temp;
            dummy = dummy.next;

            ptr1 = ptr1!=null? ptr1.next:null;
            ptr2 = ptr2!=null? ptr2.next:null;
            

            if(carry>0){
               dummy.next = new ListNode(carry);
            }
            
            

        }
        // if(ptr1!=null){
        //     dummy= ptr1.next;
        // }
        // if(ptr2!=null){
        //     dummy= ptr2.next;
        // }

        return ans.next;
    }
}