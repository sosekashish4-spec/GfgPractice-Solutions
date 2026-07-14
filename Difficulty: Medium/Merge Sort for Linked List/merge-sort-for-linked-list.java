/* Structure of a Linked List node
class Node {
	int data;
	Node next;
	Node(int key) {
		data = key;
		next = null;
	}
} */

class Solution {
	public Node mergeSort(Node head) {
		// code here
		if (head.next == null) return head;
	
		Node slow = head;
		Node fast = head;
		
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node head2 = slow.next;
		slow.next = null;
		head = mergeSort(head);
		head2 = mergeSort(head2);
		return mergeTwoLists(head, head2);
	}
	
	public Node mergeTwoLists(Node list1, Node list2) {
		Node d = new Node(-1);
		Node t = d;
		while (list1 != null && list2 != null) {
			if (list1.data<list2.data) {
				t.next = list1;
				t = t.next;
				list1 = list1.next;
			} else {
				t.next = list2;
				t = t.next;
				list2 = list2.next;
			}
		}
		if (list1 != null) t.next = list1;
		if (list2 != null)	t.next = list2;
		return d.next;
	}
}
