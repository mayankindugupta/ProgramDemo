package compareLinkedList;

class Node {

	int data;
	Node ptr;

	Node(int d) {
		data = d;
		ptr = null;
	}
}

public class CompareLinkedList {

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
		System.out.print("First List: ");
		while (t != null) {
			System.out.print(t.data+" ");
			t = t.ptr;
		} 
		
		
		Node one = new Node(10);
		Node two = new Node(23);
		Node three = new Node(3);
		Node four = new Node(75);
		Node five = new Node(53);

		one.ptr = two;
		two.ptr = three;
		three.ptr = four;
		four.ptr = five;

		Node tr = first;
		System.out.print("\n"+"Second List: ");
		while (tr != null) {
			System.out.print(tr.data+" ");
			tr = tr.ptr;
		} 
		
		boolean isCompare=compareMethod(one,first);
		if(isCompare) {
			System.out.println("\n"+"Hey Both the Linked List are Equal");
		}
		else
		{
			System.out.println("\n"+"Sorry!! Both the Linked List are Different");
		}
	}
	
	static boolean compareFunc(Node head1, Node head2)
		{
			for(  ; head1!=null && head2!=null ; head1=head1.ptr, head2=head2.ptr )
			     
	            if( head1.data != head2.data )
	                return false;
	        
	        //returning 1 if data at all nodes are equal.
	        return true;
		}
	
	static boolean compareMethod(Node head1, Node head2)
	{
		boolean flag=true;
		while(head1!=null && head2!=null)
		{
			if(head1.data!=head2.data)
				flag=false;
			
			head1=head1.ptr;
			head2=head2.ptr;
		}
		return flag;
	}
}
