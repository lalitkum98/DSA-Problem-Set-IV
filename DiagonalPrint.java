package RePracticeAlgo;

public class DiagonalPrint {
	public void printDiagonal(int array[][]) {
		int rowSize = array.length;
		int columSize = array[0].length;
		int k = 1;
		while (k < rowSize + columSize) {
			if (k <= rowSize) {
				int j = 0;
				int i = k % rowSize == 0 ? rowSize - 1 : k % rowSize - 1;
				while (i >= 0) {
					System.out.println(array[i][j]);
					i--;
					j++;

				}
			} else {
				int j = k % rowSize == 0 ? rowSize : k % rowSize;
				int i = rowSize - 1;
				while (j <= rowSize) {
					System.out.println(array[i][j]);
					i--;
					j++;
				}
			}
			k++;
		}

	}

	public static void main(String arg[]) {
		int array[][] = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }

		};

		DiagonalPrint dp = new DiagonalPrint();
		dp.printDiagonal(array);
	}
}