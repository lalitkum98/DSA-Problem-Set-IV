package RePracticeAlgo;

import RePracticeAlgo.ReverseLinkedList.Node;

public class KthReverseLinkedList {

	public Node kthReverse(Node node, int k) {
		ReverseLinkedList rl = new ReverseLinkedList();
		int flag = 1;
		int count = 1;
		Node temp = node;
		Node start = null;
		Node prev = null;
		Node next = null;
		Node revNode = null;
		while (temp != null) {
			if (count % (k) != 0) {
				temp = temp.link;
				count++;
			} else {
				next = temp.link;
				temp.link = null;
				if (flag == 1)
					start = temp;
				revNode = rl.reverseLinkedList(node);
				while (revNode.link != null) {
					revNode = revNode.link;
				}
				if (flag != 1) {
					prev.link = temp;
					prev = revNode;
				} else {
					prev = revNode;
				}
				count = 1;
				flag++;
				node = next;
				temp = next;
			}

		}
		prev.link = node;
		return start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthReverseLinkedList rll = new KthReverseLinkedList();
		ReverseLinkedList rl = new ReverseLinkedList();
		Node node = rl.new Node();
		node.data = 'a';
		node.link = rl.new Node();
		node.link.data = 'b';
		node.link.link = rl.new Node();
		node.link.link.data = 'c';
		node.link.link.link = rl.new Node();
		node.link.link.link.data = 'd';
		node.link.link.link.link = rl.new Node();
		node.link.link.link.link.data = 'e';
		node.link.link.link.link.link = rl.new Node();
		node.link.link.link.link.link.data = 'f';
		node.link.link.link.link.link.link = rl.new Node();
		node.link.link.link.link.link.link.data = 'g';
		node.link.link.link.link.link.link.link = rl.new Node();
		node.link.link.link.link.link.link.link.data = 'h';
		rl.printNode(node);
		node = rll.kthReverse(node, 3);
		rl.printNode(node);

	}

}
