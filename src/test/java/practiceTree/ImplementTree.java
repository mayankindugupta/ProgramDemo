package practiceTree;

import java.util.Stack;

public class ImplementTree {

	TreeNode root;
	
	class TreeNode {

		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int d) {
			data = d;
			left = null;
			right = null;
		}
	}

	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);

		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
	}
	
	public void printLeafeNode(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		if(root.left == null && root.right == null)
		{
			System.out.print(root.data+" ");
		}
		
		printLeafeNode(root.left);
		printLeafeNode(root.right);
	}
	
	//pre-order recursive
	public void preOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//pre-order iterative
	public void preOrder() {
		if(root == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + " ");
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null) {
				stack.push(temp.left);
			}
		}
	}
	
	//post-order recursive
	public void postOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.data+" ");
		postOrder(root.right);
		postOrder(root.left);
	}
	
	//post-order iterative
	public void postOrder(){
		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();

		while(current != null || !stack.isEmpty()){
			if(current != null){
				stack.push(current);
				current = current.left;
			} else {
				TreeNode temp = stack.peek().right;
				if(temp == null){
					temp = stack.pop();
					System.out.print(temp.data + " ");
					while(!stack.isEmpty() && temp == stack.peek().right){
						temp = stack.pop();
						System.out.print(temp.data + " ");
					}
				} else {
					current = temp;
				}
			}
		}
	}
	
	//in-order recursive
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	//in-order itrative
	public void inOrder() {
		if(root == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;

		while(!stack.isEmpty() || temp != null) {
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.data + " ");
				temp = temp.right;
			}
		}
	}

	public static void main(String[] args) {

		ImplementTree tree = new ImplementTree();
		tree.createBinaryTree();
		System.out.print("Pre Order: ");
		tree.preOrder(tree.root);
		System.out.print("\nPost Order: ");
		tree.postOrder(tree.root);
		System.out.print("\nLeaf Nodes: ");
		tree.printLeafeNode(tree.root);
	}
}
