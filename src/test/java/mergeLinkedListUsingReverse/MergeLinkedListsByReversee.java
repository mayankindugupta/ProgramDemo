package mergeLinkedListUsingReverse;

class Node {

	int data;
	Node ptr;

	Node(int d) {
		data = d;
		ptr = null;
	}
}

public class MergeLinkedListsByReversee {

	public static void main(String[] args) {

		Node first = new Node(2);
		Node second = new Node(5);
		Node third = new Node(9);
		Node fourth = new Node(12);
		Node fifth = new Node(15);

		first.ptr = second;
		second.ptr = third;
		third.ptr = fourth;
		fourth.ptr = fifth;

		Node t = first;
		System.out.print("First List: ");
		while (t != null) {
			System.out.print(t.data + " ");
			t = t.ptr;
		}

		Node one = new Node(3);
		Node two = new Node(7);
		Node three = new Node(10);
		Node four = new Node(17);
		Node five = new Node(22);

		one.ptr = two;
		two.ptr = three;
		three.ptr = four;
		four.ptr = five;

		Node tr = one;
		System.out.print("\n" + "Second List: ");
		while (tr != null) {
			System.out.print(tr.data + " ");
			tr = tr.ptr;
		}
		
		
		Node mergeNodes = sortedMerge(first,one);
		System.out.print("\nMerge Nodes: ");
		while (mergeNodes != null) {
			System.out.print(mergeNodes.data + " ");
			mergeNodes = mergeNodes.ptr;
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
	
	
	static Node sortedMerge(Node a, Node b)
	{
	    
	    // Reverse Linked List 'a'
	    a = reverse(a);
	    Node tempA = a;
		System.out.print("\nReverse Node A: ");
		while (tempA != null) {
			System.out.print(tempA.data + " ");
			tempA = tempA.ptr;
		}
	  
	    // Reverse Linked List 'b'
	    b = reverse(b);
	    Node tempB = b;
		System.out.print("\nReverse Node B: ");
		while (tempB != null) {
			System.out.print(tempB.data + " ");
			tempB = tempB.ptr;
		}
		
	  
	    // Initialize head of resultant list
	    Node head = null;
	  
	    Node temp;
	  
	    // Traverse both lists while both of them
	    // have nodes.
	    while (a != null && b != null) {
	  
	        // If a's current value is greater than or equal to
	        // b's current value.
	        if (a.data >= b.data) {
	  
	            // Store next of current Node in first list
	            temp = a.ptr;
	            
	            // Add 'a' at the front of resultant list
	            a.ptr = head;
	            
	            // Make 'a' - head of the result list
	            head = a;
	            
	            // Move ahead in first list
	            a = temp;
	        }
	        
	        // If b's value is greater. Below steps are similar
	        // to above (Only 'a' is replaced with 'b')
	        else {
	  
	            temp = b.ptr;
	            b.ptr = head;
	            head = b;
	            b = temp;
	        }
	    }
	  
	    // If second list reached end, but first list has
	    // nodes. Add remaining nodes of first list at the
	    // beginning of result list
	    while (a != null) {
	  
	        temp = a.ptr;
	        a.ptr = head;
	        head = a;
	        a = temp;
	    }
	  
	    // If first list reached end, but second list has
	    // nodes. Add remaining nodes of second list at the
	    // beginning of result list
	    while (b != null) {
	  
	        temp = b.ptr;
	        b.ptr = head;
	        head = b;
	        b = temp;
	    }
	  
	    // Return the head of the result list
	    return head;
	}
}
