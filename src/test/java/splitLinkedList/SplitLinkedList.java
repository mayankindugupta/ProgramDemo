package splitLinkedList;

class Node {

	int data;
	Node ptr;

	Node(int d) {
		data = d;
		ptr = null;
	}
}

public class SplitLinkedList {

	public static void main(String[] args) {

		int size=0;
		Node first = new Node(10);
		Node second = new Node(23);
		Node third = new Node(3);
		Node fourth = new Node(75);
		Node fifth = new Node(3);
		Node sixth = new Node(23);
		Node seventh = new Node(10);

		first.ptr = second;
		second.ptr = third;
		third.ptr = fourth;
		fourth.ptr = fifth;
		fifth.ptr = sixth;
		sixth.ptr=seventh;

		Node t = first;
		System.out.print("Input Linked List: ");
		while (t != null) {
			size++;
			System.out.print(t.data+" ");
			t = t.ptr;
		} 
		System.out.println("\n"+"Size of Linked List: "+size);
		
		int midpnt=(size)/2;
		
		System.out.println("\n"+"Mid Point of Linked List: "+midpnt);
		
		Node temp = first;
		System.out.print("First Half:");
		while(midpnt>0)
		{
			System.out.print(temp.data+" ");
			temp=temp.ptr;
			midpnt--;
		}
		
		Node one = reverse(temp.ptr);
		//temp.ptr=null;
		System.out.print("\n"+"Second Half:");
		while(one!=null) {
			System.out.print(one.data+" ");
			one=one.ptr;
		}
		
		boolean isCompare=compareMethod(one,temp);
		if(isCompare) {
			System.out.println("\n"+"Hey Both the Linked List are Equal");
		}
		else
		{
			System.out.println("\n"+"Sorry!! Both the Linked List are Different");
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
	
	static boolean compareMethod(Node head1, Node head2)
	{
		boolean flag=true;
		while(head1!=null & head2!=null)
		{
			if(head1.data!=head2.data)
				flag=false;
			
			head1=head1.ptr;
			head2=head2.ptr;
		}
		return flag;
	}
}
