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
    static ListNode insert(ListNode head, int val) {
    	if (head == null) {
        	return new ListNode(val); 
    	}
    	ListNode temp = head;
    	while (temp.next != null) {
    	    	temp = temp.next;
    	}
    	ListNode node = new ListNode(val);
    	temp.next = node;
    	return head;
   }
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode temp=null;
        int rem=0;
        while(head1!=null && head2!=null){
            int num=head1.val+head2.val+rem;
            temp=insert(temp,num%10);
            rem=num/10;
            head1=head1.next;
            head2=head2.next;
            
        }while(head1!=null){
            int num=head1.val+rem;
            temp=insert(temp,num%10);
            rem=num/10;
            head1=head1.next;
        }while(head2!=null){
            int num=head2.val+rem;
            temp=insert(temp,num%10);
            rem=num/10;
            head2=head2.next;
        }if(rem!=0){
            temp=insert(temp,rem);
        }
        return temp;
    }
}