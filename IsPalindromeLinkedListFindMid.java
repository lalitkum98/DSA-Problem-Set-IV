package RePracticeAlgo;

public class IsPalindromeLinkedListFindMid {
	static class Node {
		char data;
		Node link;
	}
	public Node findMid(Node node) {
		Node temp = new Node();
		temp = node;
		while (temp.link != null && temp.link.link != null) {
			node = node.link;
			temp = temp.link.link;
		}
		System.out.print("Mid of linkedList : " + node.data);
		return node;
	}

	public void printNode(Node node) {
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.link;
		}

	}
	public char findMidUsingRecursion(Node node, Node temp) {
		if (temp == null || temp.link == null) {
			return node.data;
		}
		node = node.link;
		temp = temp.link.link;
		return findMidUsingRecursion(node, temp);

	}

	public static void main(String arg[]) {
		Node node = new Node();
		node.data = 'a';
		node.link = new Node();
		node.link.data = 'b';
		node.link.link = new Node();
		node.link.link.data = 'c';
		node.link.link.link = new Node();
		node.link.link.link.data = 'b';
		// node.link.link.link.link=new Node();
		// node.link.link.link.link.data='a';
		IsPalindromeLinkedListFindMid PL = new IsPalindromeLinkedListFindMid();
		PL.printNode(node);
		PL.findMid(node);
		System.out.println(PL.findMidUsingRecursion(node,node));

	}
}
