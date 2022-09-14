package mergeLinkedListUsingDummy;

class Node {

	int data;
	Node ptr;
	
	Node() {}

	Node(int d) {
		data = d;
		ptr = null;
	}
}

public class MergeLinkedListsByDummy {

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

		System.out.print("\n" + "Merged Sorted List using dummy: ");
		Node retNode = mergeLinkedList(first,one);
		while (retNode != null) {
			System.out.print(retNode.data + " ");
			retNode = retNode.ptr;
		}
		
		
		System.out.print("\n" + "Merged Sorted List using recursion: ");
		Node retNode1 = SortedMerge(first,one);
		while (retNode1 != null) {
			System.out.print(retNode1.data + " ");
			retNode1 = retNode1.ptr;
		}
		
	}

	static Node mergeLinkedList(Node listA, Node listB) {

		// create dummy Node
	    Node dummyNode = new Node();

		Node tail = dummyNode;

		// will break out of Loop
		while (true) {
			// check if listA is empty of traversed
			if (listA == null) {
				tail.ptr = listB;
				break;
			}
			// check if listB is empty of traversed
			if (listB == null) {
				tail.ptr = listA;
				break;
			}

			/*
			 * check which listdata is lesser will be appended to tail.next
			 */
			if (listA.data <= listB.data) {
				tail.ptr = listA;
				listA = listA.ptr;
			} else {
				tail.ptr = listB;
				listB = listB.ptr;
			}

			// update tail
			tail = tail.ptr;
		}
		// returning the Result List
		return dummyNode.ptr;
	}
	
	static Node SortedMerge(Node A, Node B) 
    {
      
        if(A == null) return B;
        if(B == null) return A;
          
        if(A.data < B.data) 
        {
            A.ptr = SortedMerge(A.ptr, B);
            return A;
        }
        else 
        {
            B.ptr = SortedMerge(A, B.ptr);
            return B;
        }
          
    }
}
