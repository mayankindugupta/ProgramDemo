package reverseLinkedList;

class Node {

	int data;
	Node ptr;

	Node(int d) {
		data = d;
		ptr = null;
	}
}

public class ReverseLinkedList {

	public static void main(String[] args) {

		Node first = new Node(10);
		Node second = new Node(23);
		Node third = new Node(3);
		Node fourth = new Node(75);
		Node fifth = new Node(53);

		first.ptr = second;
		second.ptr = third;
		third.ptr = fourth;
		fourth.ptr = fifth;

		Node t = first;
		System.out.print("Input: ");
		while (t != null) {
			System.out.print(t.data+" ");
			t = t.ptr;
		} 
		
		
		System.out.println();
		Node rev = reverse(first);
		System.out.print("Output: ");
		while (rev != null) {
			System.out.print(rev.data+" ");
			rev = rev.ptr;
		} 
		
	}
	
	static Node reverse(Node head)
		{
		 Node prev = null;
		 Node cur = head;
		 Node next = null;
		 
		 while(cur!=null) {
			 next=cur.ptr;
			 cur.ptr=prev;
			 prev=cur;
			 cur=next;
		 }
		 	head=prev;
			return prev;
		}
}
