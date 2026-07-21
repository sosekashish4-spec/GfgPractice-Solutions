/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        Node pre=null;
        Node cr=head;
        Node f;
        while(cr!=null){
            f=cr.next;
            cr.next=pre;
            cr.prev=f;
            pre=cr;
            cr=f;
        }
        return pre;
    }
}