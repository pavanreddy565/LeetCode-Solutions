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
    int Length(ListNode head){
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }return len;
    }
    public ListNode middleNode(ListNode head) {
        int n=this.Length(head);
        int mid=n/2,i=0;
        //System.out.println(n+" "+mid);
        ListNode temp=head;
        while(temp!=null){
            if(i==mid){
                return temp;
            }
            i++;
            temp=temp.next;
        }return null;
    }
}