/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    Node findNode(Node head,int value){
        Node temp = head;
        while(temp!=null){
            if(temp.val==value){
                return temp;
            }
            temp=temp.next;
        }return null;
    }Node copyNode(Node head){
        Node temp = head;
        Node rand = new Node(-1);
        Node rando=rand;
        while(temp!=null){
            Node r = new Node(temp.val);
            rand.next =r ;
            temp=temp.next;
            rand=rand.next;
        }return rando.next;
    }
    public Node copyRandomList(Node head) {
        Node temp =head;
        Node rand=this.copyNode(head);
        Node rando= rand;
        while(temp!=null){
            if(temp.random==null){
                rand.random=null;
            }else{
                rand.random=this.findNode(rando,temp.random.val);
            }rand=rand.next;
            temp=temp.next;
        }return rando;
    }
}