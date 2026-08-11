/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    public Node ans(int []arr,int lo,int hi){
        int mid=(lo+hi)/2;
        if(lo>hi) return null;
        Node temp=new Node(arr[mid]);
        temp.left=ans(arr,lo,mid-1);
        temp.right=ans(arr,mid+1,hi);
        return temp;
    }
    public Node sortedArrayToBST(int[] arr) {
        int n=arr.length;
        return ans(arr,0,n-1);
    }
}