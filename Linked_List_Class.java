package assignment1;

public class Linked_List_Class {
	Node root;

	public void create_list() {
		root = null;
	}

	void insert(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;
		} else {
			Node t;
			t = root;
			while (t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
		System.out.println(n.data + " inserted");
	}

	public void displayAlternateNodes() {
		Node current = root;
		boolean display = true;

		System.out.println("Alternate nodes of the list:");
		while (current != null) {
			if (display) {
				System.out.print(current.data + " ");
			}
			display = !display;
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Linked_List_Class list = new Linked_List_Class();
		list.create_list();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.displayAlternateNodes();
	}

}
