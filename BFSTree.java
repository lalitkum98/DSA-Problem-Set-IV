package RePracticeAlgo;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTree {
	static class Tree {
		int value;
		Tree left;
		Tree right;
	}

	public void traveresBFS(Tree root, Queue<Tree> queue) {
		if (queue.isEmpty())
			return;
		root = queue.element();
		queue.remove();
		System.out.println(root.value);
		if (root.left != null)
			queue.add(root.left);
		if (root.right != null)
			queue.add(root.right);
		traveresBFS(root, queue);
	}

	public void printTree(Tree root) {
		if (root != null) {
			System.out.println(root.value);
			System.out.println("/" + "\\");
		} else {
			return;
		}
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Tree> queue = new LinkedList<Tree>();
		BFSTree bfs = new BFSTree();
		Tree root = new Tree();
		root.value = 8;
		root.left = new Tree();
		root.left.value = 10;
		root.left.left = new Tree();
		root.left.left.value = 15;
		root.right = new Tree();
		root.right.value = 12;
		root.right.left = new Tree();
		root.right.right = new Tree();
		root.right.left.value = 13;
		root.right.right.value = 14;
		queue.add(root);
		bfs.traveresBFS(root, queue);
		bfs.printTree(root);
	}

}
