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
        ListNode ptr=head;
        while(ptr!=null){
            len++;
            ptr=ptr.next;
        }return len;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len=this.len(head);
        int parts = len/k,extra=len%k;
        ListNode ans[]=new ListNode[k];
        ListNode ptr=head;

        for(int i=0;i<k;i++){
            int num=parts;
            if(extra>0)
                num++;
            ListNode temp=new ListNode(-1);
            ListNode ansT=temp;
            
            for(int j=0;j<num && ptr!=null;j++){
                temp.next=new ListNode(ptr.val);
                temp=temp.next;
                ptr=ptr.next;
            }ans[i]=ansT.next;
            extra--;

        }return ans;
    }
}