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
    void print(ListNode node,int i){
        while(node!=null){
            System.out.print(node.val + " ");
            node = node.next;
        }System.out.println(i);
    }
    ListNode mergeTwo(ListNode a, ListNode b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.val <= b.val) {
            a.next = mergeTwo(a.next, b);
            return a;
        } else {
            b.next = mergeTwo(a, b.next);
            return b;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
         for (int gap = 1; gap < k; gap *= 2) {
            for (int i = 0; i + gap < k; i += gap * 2) {
                lists[i] = mergeTwo(lists[i], lists[i + gap]);
            }
        }

        return k > 0 ? lists[0] : null;
    }
}