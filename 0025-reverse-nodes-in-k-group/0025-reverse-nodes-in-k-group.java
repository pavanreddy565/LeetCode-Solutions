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
    ListNode kthNode(ListNode head,int k){
        ListNode temp=head;
        while(k>1){
            temp=temp.next;
            k--;
        }return temp;
    }ListNode reverse(ListNode head){
        ListNode temp=head, prev=null, next;
        while(temp!=null){
            next=temp.next;
            temp.next = prev;

            prev=temp;
            temp=next;
        }return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head,kthnode,nextNode, prevNode=null;
        while(temp!=null){
            kthnode = this.kthNode(temp,k);
            if (kthnode==null){
                if(prevNode!=null){
                    prevNode.next = temp;
                }
                break;
            }nextNode = kthnode.next;
            kthnode.next=null;
            this.reverse(temp);
            if(temp==head){
                head=kthnode;
            }else{
                prevNode.next = kthnode;
            }prevNode = temp;
            temp = nextNode;
        }return head;
        
        

    }
}