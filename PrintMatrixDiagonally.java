package ProblemSetIV;

public class PrintMatrixDiagonally {

	public void printMatrixDiagonally(int arr[][]) {
		int length = arr.length;
		int i = 0, j = 0;
		for (int k = 0; k < (length * 2) - 1; k++) {
			i = k;
			if (k >= length) {
				i = length - 1;
				j = k % length + 1;
			}
			while (0 <= i && j < length) {
				System.out.println(arr[i][j]);
				i--;
				j++;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 03, 05, 07, 04 }, { 12, 22, 10, 23 },
				{ 01, 06, 22, 13 }, { 51, 88, 14, 21 } };
		PrintMatrixDiagonally md = new PrintMatrixDiagonally();
		md.printMatrixDiagonally(arr);
	}

}
