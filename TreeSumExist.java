package RePracticeAlgo;

public class TreeSumExist {

	static class Tree {
		int value;
		Tree left;
		Tree right;
	}

	public boolean sumExist(Tree root, int sum) {

		if (root != null && sum == 0) {
			return true;
		} else if (root == null && sum != 0) {
			return false;
		} else if (root == null && sum == 0) {
			return true;
		}
		return sumExist(root.left, sum - root.value)
				|| sumExist(root.right, sum - root.value);

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

	public static void main(String arg[]) {
		TreeSumExist tse = new TreeSumExist();
		Tree root = new Tree();
		root.value = 8;
		root.left = new Tree();
		root.left.value = 10;
		root.right = new Tree();
		root.right.value = 12;
		root.left.left = new Tree();
		root.left.left.value = 15;
		root.right.left = new Tree();
		root.right.right = new Tree();
		root.right.left.value = 13;
		root.right.right.value = 14;
		System.out.println(tse.sumExist(root, 25));
		tse.printTree(root);

	}

}
