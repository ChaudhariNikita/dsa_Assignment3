package assignment1;

import java.util.Scanner;

public class BST2 {
	private static Node root;

	void create_tree() {
		root = null;
	}

	void insert(Node r, Node n) {
		if (root == null)
			root = n;
		else {
			if (n.data < r.data) {
				if (r.left == null) {
					r.left = n;
					System.out.println(n.data + "inserted");
				} else
					insert(r.left, n);
			} else {
				if (r.right == null)
					r.right = n;
				else
					insert(r.right, n);
			}
		}
	}

	void inorder(Node r) {
		if (r != null) {
			inorder(r.left);
			System.out.print(r.data + ",");
			inorder(r.right);
		}
	}

	Node deleteRec(Node root, int key) {
		if (root == null)
			return root;

		if (key < root.data)
			root.left = deleteRec(root.left, key);
		else if (key > root.data)
			root.right = deleteRec(root.right, key);
		else {

			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			root.right = deleteRec(root.right, root.data);
		}
		return root;
	}

	Node get_root() {
		return root;
	}

	public static void main(String[] args) {
		BST2 bst = new BST2();
		Scanner sc = new Scanner(System.in);
		bst.create_tree();
		int ch, no;
		do {
			System.out.println("\n ----Binary Search Tree-------");
			System.out.println("1.Create Binary Search Tree");
			System.out.println("2.Display tree");
			System.out.println("3.Delete element from tree");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				bst.insert(bst.get_root(), new Node(50));
				bst.insert(bst.get_root(), new Node(40));
				bst.insert(bst.get_root(), new Node(30));
				bst.insert(bst.get_root(), new Node(20));
				break;
			case 2:
				bst.inorder(root);
				;
				break;
			case 3:
				System.out.println("Enter element for delete");
				no = sc.nextInt();
				bst.deleteRec(root, no);
				break;
			case 0:
				System.out.println("Thank you");
				break;
			}
		} while (ch != 0);

	}

}
