package ProblemSetIV;

public class MinEditToMakeStringPalindrome {

	// recursive sloution
	public int findMinEdit(String str, int start, int end) {
		if (start > end)
			return Integer.MAX_VALUE;
		if (start == end)
			return 0;
		if (start == end - 1)
			return (str.charAt(start) == str.charAt(end)) ? 0 : 1;

		if (str.charAt(start) == str.charAt(end))
			return findMinEdit(str, start + 1, end - 1);
		else
			return Math.min(findMinEdit(str, start, end - 1),
					findMinEdit(str, start + 1, end)) + 1;

	}

	// dynamic solution
	public int findMinEditDynamic(String str) {
		int[][] temp = new int[str.length()][str.length()];
		// iterate diagonally
		for (int i = 1; i < str.length(); i++) {
			for (int start = 0, end = i; end < str.length(); start++, end++) {
				if (str.charAt(start) == str.charAt(end))
					temp[start][end] = temp[start + 1][end - 1];
				else
					temp[start][end] = Math.min(temp[start][end - 1],
							temp[start + 1][end]) + 1;
			}
		}
		return temp[0][str.length() - 1];
	}

	public static void main(String[] args) {
		// String str = "agbdba";
		String str = "fabccf";
		MinEditToMakeStringPalindrome msp = new MinEditToMakeStringPalindrome();
		System.out.println(msp.findMinEdit(str, 0, str.length() - 1));
		System.out.println(msp.findMinEditDynamic(str));
	}

}
