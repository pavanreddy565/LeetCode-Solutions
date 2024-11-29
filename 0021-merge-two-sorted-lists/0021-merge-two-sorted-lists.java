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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2 == null) return list1;
        ListNode temp = list1;
        ListNode temp1 = list2;
        ListNode ans = new ListNode(-1);
        ListNode sol = ans;
        
        while(temp!= null && temp1!=null){
            if(temp.val<temp1.val){
                ans.next=new ListNode(temp.val);
                temp=temp.next;
            }else{
                ans.next=new ListNode(temp1.val);
                temp1=temp1.next;
            }ans=ans.next;
        }
        while(temp!=null){
            ans.next=new ListNode(temp.val);
            temp=temp.next;
            ans = ans.next;
        }
        while(temp1!=null){
            ans.next=new ListNode(temp1.val);
            temp1=temp1.next;
            ans = ans.next;
        }return sol.next;
    }
}