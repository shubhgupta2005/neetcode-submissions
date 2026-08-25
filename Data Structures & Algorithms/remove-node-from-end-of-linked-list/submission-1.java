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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        
        
        int len=count-n;
        if(n==count)return head.next;
        curr=head;
        for(int i=0;i<count-1;i++){
            if((i+1) == len){
                curr.next=curr.next.next;
                break;
            }
            curr=curr.next;
        }
        
        
        return head;


    }
}
