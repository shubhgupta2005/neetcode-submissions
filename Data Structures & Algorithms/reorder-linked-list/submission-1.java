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
    public void reorderList(ListNode head) {
        //used slow fast pointer flyods algo to find the mid p ointer then we split the list two list we reverse the second list and then merge by the logic one from first one from secod
        
        if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        
        ListNode curr=slow.next;
        slow.next=null;
        ListNode prev=null,next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode first=head;
        ListNode second=prev;

        while(second !=null){
            ListNode tmp1=first.next;
            ListNode tmp2=second.next;
            first.next=second;
            second.next=tmp1;
            first=tmp1;
            second=tmp2;
        }
        

        
        
    }
}
