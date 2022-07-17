package practiceLinkedList;

import java.util.Stack;

 class Node {

	int data;
	Node ptr;

	Node(int d) {
		data = d;
		ptr = null;
	}
}

public class Palindrome {

	public static void main(String[] args) {

		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(2);
		Node fifth = new Node(1);

		first.ptr = second;
		second.ptr = third;
		third.ptr = fourth;
		fourth.ptr = fifth;

		Node temp = first;
		System.out.print("Input: ");
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.ptr;
		}
		System.out.println();
		boolean isPalindrome = palindrome(first);

		if (isPalindrome == true)
			System.out.println("Hey, This Linked List is Palindrome");
		else
			System.out.println("Oops, This Linked List NOT a Palindrome");
	}

	static boolean palindrome(Node head) {
		boolean flag = true;
		Node temp = head;
		Stack<Integer> stk = new Stack<Integer>();
		while (temp != null) {
			stk.push(temp.data);
			temp = temp.ptr;
		}

		while (head != null) {
			int val = stk.pop();
			if (val == head.data) {
				flag = true;
			} else {
				flag = false;
				break;
			}
			head = head.ptr;
		}
		return flag;
	}

}
