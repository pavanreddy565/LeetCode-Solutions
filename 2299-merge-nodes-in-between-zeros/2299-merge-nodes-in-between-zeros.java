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
    // void print(ListNode head){
    //     ListNode temp =head;
    //     while(temp!=null){
    //         System.out.print(temp.val);
    //         temp=temp.next;
    //     }
    // }
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head,new_p=null;

        while(temp.next!=null){
            if(temp.next.val!=0){
                temp.val+=temp.next.val;
                temp.next=temp.next.next;
            }else{
                new_p=temp;
                temp=temp.next;
            }
        }new_p.next=null;
        return head;
    }
}