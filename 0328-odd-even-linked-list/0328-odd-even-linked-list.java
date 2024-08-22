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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode odd = head,even= head.next,evenHead =head.next;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            // System.out.println(odd.val+" Odd Even"+even.val);
            odd=odd.next;
            even=even.next;
            
        }
        // if(odd.next.next!=null){
        //      odd.next=odd.next.next;
        //      odd=odd.next;
        // }
           
        odd.next=evenHead;
        return head;
    }
}