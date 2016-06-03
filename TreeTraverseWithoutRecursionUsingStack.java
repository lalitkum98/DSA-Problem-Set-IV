package ProblemSetIV;

import java.util.Stack;

import ProblemSetIV.SymanticFindSubTree.Tree;

public class TreeTraverseWithoutRecursionUsingStack {
	public void traverseTree(Tree root) {
		Stack<Tree> stack = new Stack<Tree>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Tree newRoot = (Tree) stack.pop();
			System.out.print(newRoot.value);
			if (newRoot.left != null || newRoot.right != null) {
				stack.push(newRoot.right);
				stack.push(newRoot.left);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree root2 = new Tree();
		root2.value = 1;
		root2.left = new Tree();
		root2.right = new Tree();
		root2.left.value = 2;
		root2.right.value = 3;
		root2.left.left = new Tree();
		root2.left.right = new Tree();
		root2.right.left = new Tree();
		root2.right.right = new Tree();
		root2.left.left.value = 1;
		root2.left.right.value = 4;
		root2.right.left.value = 5;
		root2.right.right.value = 6;
		TreeTraverseWithoutRecursionUsingStack traverse = new TreeTraverseWithoutRecursionUsingStack();
		traverse.traverseTree(root2);
	}

}
