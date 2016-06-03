package ProblemSetIV;

public class SymanticFindSubTree {
	static class Tree {
		int value;
		Tree left;
		Tree right;
	}

	public boolean isTreeIdentical(Tree root1, Tree root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		return root1.value == root2.value
				&& isTreeIdentical(root1.left, root2.left)
				&& isTreeIdentical(root1.right, root2.right);
	}

	public boolean isSubExist(Tree root1, Tree root2) {
		if (root1 == null)
			return true;
		if (root2 == null)
			return false;
		if (isTreeIdentical(root1, root2))
			return true;
		return isSubExist(root1, root2.left) || isSubExist(root1, root2.right);
	}

	public static void main(String arg[]) {
		Tree root1 = new Tree();
		root1.value = 2;
		root1.left = new Tree();
		root1.right = new Tree();
		root1.left.value = 1;
		root1.right.value = 4;
		// root1.left.left = new Tree();
		// root1.left.right = new Tree();
		// root1.right.left = new Tree();
		// root1.right.right = new Tree();
		// root1.left.left.value = 2;
		// root1.left.right.value = 2;
		// root1.right.left.value = 2;
		// root1.right.right.value = 2;
		//
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

		SymanticFindSubTree st = new SymanticFindSubTree();
		System.out.println(st.isSubExist(root1, root2));

	}
}
