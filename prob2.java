// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes



class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode pre=null;
        ListNode curr=slow.next;
        slow.next=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        ListNode p1=head;
        ListNode p2=pre;
        while(p2!=null){
        ListNode next1=p1.next;
        ListNode next2=p2.next;
        p1.next=p2;
        p2.next=next1;
        p1=next1;
        p2=next2;

        }
    }
}