import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// "static void main" must be defined in a public class.
public class Tree {

	public static class Node {
		Node left;
		Node right;
		int value;

		public Node(int val) {
			value = val;
		}

	}

	static Node root;

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		root = levelOrderTree(arr);
		System.out.print("Inorder Traversal: ");
		inorderPrint(root);
		System.out.println();
		System.out.print("Preorder Traversal: ");
		preorderPrint(root);
		System.out.println();
		System.out.print("Postorder Traversal: ");
		postorderPrint(root);
		System.out.println();
		System.out.print("Levelorder Traversal: ");
		BFSPrint(root);
		System.out.println();
		System.out.print("Depth First order Traversal: ");
		DFSPrint(root);
	
	}

	public static Node levelOrderTree(int[] arr) {
		Node root = levelOrderTree(arr, 0);
		return root;
	}

	public static Node levelOrderTree(int[] arr, int start) {
		Node current = new Node(arr[start]);
		int left = 2 * start + 1;
		int right = 2 * start + 2;
		if (left < arr.length)
			current.left = levelOrderTree(arr, left);
		if (right < arr.length)
			current.right = levelOrderTree(arr, right);

		return current;
	}
	//inorder
	public static void inorderPrint(Node curr) {
		if (curr != null) {
			inorderPrint(curr.left);
			System.out.print(curr.value + " ");
			inorderPrint(curr.right);

		}
	}
	//postorder
	public static void postorderPrint(Node curr) {
		if (curr != null) {
			postorderPrint(curr.left);
			postorderPrint(curr.right);
			System.out.print(curr.value + " ");

		}

	}
	//preorder
	public static void preorderPrint(Node curr) {
		if (curr != null) {
			System.out.print(curr.value + " ");
			preorderPrint(curr.left);
			preorderPrint(curr.right);
			
		}

	}
	
	public static void BFSPrint(Node curr) {
		Queue<Node> queue = new LinkedList<>();
		if(curr != null){
			queue.add(curr);
		}
		
		while (!queue.isEmpty()) {
			Node temp = queue.remove();
			System.out.print(temp.value + " ");
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
		}
	}
	
	public static void DFSPrint(Node curr) {
		Stack<Node> stk = new Stack<>();
		if(curr != null){
			stk.push(curr);
		}
		
		while (!stk.isEmpty()) {
			Node temp = stk.pop();
			System.out.print(temp.value + " ");
			if (temp.left != null)
				stk.push(temp.left);
			if (temp.right != null)
				stk.push(temp.right);
		}
	}
}