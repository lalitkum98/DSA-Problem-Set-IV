package ProblemSetIV;

import java.util.Stack;

// also we call spiral form 
public class TreePrintZigZag {
	class Tree {
		int value;
		Tree left;
		Tree right;
	}

	public void printZigZag(Tree root, boolean zig, Stack stack1, Stack stack2) {
		if (root == null)
			return;
		stack1.push(root);
		while (!stack1.empty() || !stack2.empty()) {
			while (!stack1.empty()) {
				Tree copyRoot = (Tree) stack1.pop();
				System.out.println(copyRoot.value);
				if (copyRoot.left != null)
					stack2.push(copyRoot.left);
				if (copyRoot.right != null)
					stack2.push(copyRoot.right);
			}
			while (!stack2.empty()) {
				Tree copyRoot = (Tree) stack2.pop();
				System.out.println(copyRoot.value);
				if (copyRoot.right != null)
					stack1.push(copyRoot.right);
				if (copyRoot.left != null)
					stack1.push(copyRoot.left);
			}
		}
	}

	public Tree createTree() {
		Tree tr = new Tree();
		tr.value = 22;
		tr.left = (new Tree());
		tr.right = (new Tree());
		tr.left.value = 15;
		tr.right.value = 40;
		tr.left.right = (new Tree());
		tr.left.left = (new Tree());
		tr.left.right.value = 20;
		tr.left.left.value = 12;
		tr.right.left = (new Tree());
		tr.right.right = (new Tree());
		tr.right.left.value = 25;
		tr.right.right.value = 41;
		return tr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		boolean zig = false;
		TreePrintZigZag zz = new TreePrintZigZag();
		Tree root = zz.createTree();
		zz.printZigZag(root, zig, stack1, stack2);

	}

}
