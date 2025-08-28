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
    public ListNode mergeNodes(ListNode head) {
        int currsum=0;
        ListNode dummy = new ListNode(-1);
        ListNode ans=dummy;
        ListNode temp =head.next;
        while(temp!=null){
            currsum+=temp.val;
            if(temp.val==0){
                dummy.next= new ListNode(currsum);
                dummy=dummy.next;
                currsum=0;
            }
            temp= temp.next;
        }
        return ans.next;
    }
}