/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}*/

class Solution {
    public Node cloneLinkedList(Node head) {
        HashMap<Node,Node>map=new HashMap<>();
         Node temp=head;
         Node ptr=new Node(-1);
         Node p=ptr;
         while(temp!=null){
             Node t=new Node(temp.data);
             map.put(temp,t);
             p.next=t;
             p=p.next;
             temp=temp.next;
         }
        map.put(null,null);
        temp=head;
        while(temp!=null){
            map.get(temp).random=map.get(temp.random);
            temp=temp.next;
        }
        return ptr.next;
    }
}