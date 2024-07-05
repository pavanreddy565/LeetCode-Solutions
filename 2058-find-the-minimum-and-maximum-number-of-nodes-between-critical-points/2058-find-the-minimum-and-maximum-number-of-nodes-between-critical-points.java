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
 import java.util.*;
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp= head;
        int prev=temp.val;
        int now,after;
        temp=temp.next;
        ArrayList<Integer> ans=new ArrayList<>();
        int num=1;
        
        while(temp.next!=null){
            now=temp.val;
            after=temp.next.val;
            num++;
            if((now>prev && now>after)|| (now<prev && now<after)){
                ans.add(num);
            
            }
            prev=now;
            temp=temp.next;
        }
        if(ans.size()<2){
            return new int[]{-1,-1};
        }ArrayList<Integer> arr=new ArrayList<>();
        int n=ans.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                arr.add(ans.get(j)-ans.get(i));
            }
        }return new int[]{Collections.min(arr),Collections.max(arr)};
    }
}