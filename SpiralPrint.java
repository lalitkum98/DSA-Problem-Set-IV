package RePracticeAlgo;

public class SpiralPrint {

	/*
	 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 {16,17,18,19,20} o/p:1 2 3 4 5 10 15
	 * 14 13 12 11 6 7 8 9
	 */

	public void printSpiral(int array[][]) {
		int startRow = 0;
		int endRow = array.length - 1;
		int startColum = 0;
		int endColum = array[0].length - 1;
		while (startRow <= endRow || startColum <= endColum) {

			for (int j = startColum; j <= endColum - 1; j++)
				System.out.println(array[startRow][j]);
			for (int i = startRow; i <= endRow - 1; i++)
				System.out.println(array[i][endColum]);
			for (int j = endColum; j >= startColum + 1; j--)
				System.out.println(array[endRow][j]);
			for (int i = endRow; i >= startRow + 1; i--)
				System.out.println(array[i][startColum]);

			startRow++;
			startColum++;
			endRow--;
			endColum--;
		}

	}

	public static void main(String arg[]) {
		int array[][] = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }

		};

		SpiralPrint sp = new SpiralPrint();
		sp.printSpiral(array);

	}
}
