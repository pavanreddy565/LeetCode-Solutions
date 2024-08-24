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
    int len(ListNode head){
        int len=0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }return len;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int x=this.len(head);
        ListNode temp=head;
        if(x==n){
            return head.next;
        }
        if(x==1){
            return null;
        }
        while(x>n+1){
            System.out.println(temp.val);
            temp=temp.next;
            x--;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }else{
            temp=null;
        }
        return head;
    }
}