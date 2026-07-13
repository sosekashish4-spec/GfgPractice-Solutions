/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
         int count=0;
         Node temp=head;
        while(temp!=null) {
            temp=temp.next;
            count++;
        }
        if(count==1) return head;
        
        k%=count;
        if(k==0) return head;
        
        Node a=head;
        for(int i=1;i<k;i++){
            a=a.next;
        }
        Node b=a.next;
        a.next=null;
        
        Node t=b;
        while(t.next!=null) t=t.next;
        t.next=head;
        
        return b;
    }
}