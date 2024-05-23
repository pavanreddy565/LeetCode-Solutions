# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        l=head
        r=head.next
        while r!=None:
            newNode= ListNode(math.gcd(l.val,r.val),r)
            l.next=newNode
           
            l=r
           
            r=r.next
        
        return head
        