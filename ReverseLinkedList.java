package RePracticeAlgo;

public class ReverseLinkedList {
	class Node {
		char data;
		Node link;
	}

	public Node insertNode(Node node, char a) {
		Node temp = new Node();
		temp.data = a;
		temp.link = null;
		while (node.link != null) {
			node = node.link;
		}
		node.link = temp;
		return node;
	}

	public Node deleteNode(Node node, char a) {
		Node prev = new Node();
		while (node != null) {
			if (node.data == a) {
				prev.link = node.link;
				node = null;
				break;
			} else {
				prev = node;
				node = node.link;
			}
		}
		return node;
	}

	public Node reverseLinkedList(Node node) {
		Node current = node;
		Node prev = null;
		Node next = null;
		while (current != null) {
			next = current.link;
			current.link = prev;
			prev = current;
			node = prev;
			current = next;
		}
		return node;
	}

	public void printNode(Node node) {

		while (node != null) {
			System.out.print(node.data + "->");
			node = node.link;
		}

	}

	public static void main(String arg[]) {
		ReverseLinkedList RLL = new ReverseLinkedList();
		Node node = RLL.new Node();
		node.data = 's';
		RLL.insertNode(node, 'a');
		RLL.insertNode(node, 'b');
		RLL.insertNode(node, 'c');
		RLL.insertNode(node, 'e');
		RLL.insertNode(node, 'f');
		RLL.insertNode(node, 'g');
		RLL.insertNode(node, 'h');
		// RLL.printNode(node);
		// RLL.deleteNode(node, 'h');
		// RLL.printNode(node);
		Node reverseNode = RLL.reverseLinkedList(node);
		RLL.printNode(reverseNode);
	}
}
