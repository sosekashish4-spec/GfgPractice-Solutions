/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    void reverse(Node head){
        Node p=null;
        Node c=head;
        Node f;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
    }
    public Node reverseCircular(Node head) {
        Node tail=head;
        while(tail.next!=head) tail=tail.next;
        tail.next=null;
        reverse(head);
        head.next=tail;
        return tail;
    }
}