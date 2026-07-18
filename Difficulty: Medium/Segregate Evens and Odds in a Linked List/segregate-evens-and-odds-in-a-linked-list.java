/* Structure of a link list node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node divide(Node head) {
        Node even=new Node(-1);
        Node odd=new Node(-1);
        Node temp=head;
        Node i=even;
        Node j=odd;
        
        while(temp!=null){
             if(temp.data%2==0){
                 i.next=temp;
                 temp=temp.next;
                 i=i.next;
             }else{
                 j.next=temp;
                 temp=temp.next;
                 j=j.next;
             }
        }
        j.next=null;
        i.next=odd.next;
        return even.next;
    }
}