package ProblemSetIV;

public class PatternMatching {

	public boolean isPatternMatched(String string, String pattern) {
		int i = 0;
		int j = 0;
		while (i != string.length() || j != pattern.length()) {

			if (string.charAt(i) == pattern.charAt(j)) {
				i++;
				j++;
				if (j >= pattern.length() && i >= string.length()) {
					return true;
				}
			}
			if (string.charAt(i) != pattern.charAt(j)) {
				if (pattern.charAt(j) == '*') {
					j++;
					if (j >= pattern.length()) {
						return true;
					}
				} else {
					i++;
					if (i >= string.length()) {
						return false;
					}
				}
			}

		}
		return false;
	}

	public static void main(String[] args) {
		// String pattern ="*yy*";
		// String pattern ="Hello*";
		// String pattern ="*yykk@";
		String pattern = "Helloyykk";
		String string = "Helloyykk@";
		PatternMatching pp = new PatternMatching();
		System.out.println(pp.isPatternMatched(string, pattern));
	}

}
