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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st= new Stack<>();
        ListNode ptr = head;
        while(ptr!= null){
            st.push(ptr.val);
            ptr =ptr.next;
        }


        ListNode ptr2 = head;
        while(ptr2!= null){
            if(st.peek()==ptr2.val){
                st.pop();
            }
            else{
                return false;
            }
            ptr2 =ptr2.next;
        }
        return true;
    }
}