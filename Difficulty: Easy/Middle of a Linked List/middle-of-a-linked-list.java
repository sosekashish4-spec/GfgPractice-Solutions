/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        int i=0;
        while(i!=count/2){
            temp=temp.next;
            i++;
        }
        return temp.data;
    }
}