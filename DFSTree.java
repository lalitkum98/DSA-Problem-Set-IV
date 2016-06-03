package RePracticeAlgo;

public class DFSTree {
	static class Tree {
		int value;
		Tree left;
		Tree right;
	}

	// Tree DFS Inorder Preorder postorder
	public void preorderTravrsal(Tree root) {
		if (root == null)
			return;
		System.out.print(root.value + ",");
		preorderTravrsal(root.left);
		preorderTravrsal(root.right);
	}

	public void inorderTravrsal(Tree root) {
		if (root == null)
			return;
		inorderTravrsal(root.left);
		System.out.print(root.value + ",");
		inorderTravrsal(root.right);
	}

	public void postorderTravrsal(Tree root) {
		if (root == null)
			return;
		postorderTravrsal(root.left);
		postorderTravrsal(root.right);
		System.out.print(root.value + ",");
	}

	public static void main(String arg[]) {
		DFSTree dfs = new DFSTree();
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
		dfs.preorderTravrsal(root);
		System.out.println("");
		dfs.inorderTravrsal(root);
		System.out.println("");
		dfs.postorderTravrsal(root);
	}
}
