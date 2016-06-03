package RePracticeAlgo;

public class MinSumPathInMatrix {
	public int findMinSumPath(int array[][], int i, int j, int sum, int minSum) {
		if (i >= array.length || j >= array[0].length)
			return minSum;
		if (i == array.length - 1 && j == array[0].length - 1) {
			if (minSum == 0) {
				minSum = sum + array[i][j];
				return sum + array[i][j];

			} else {
				if (minSum < sum + array[i][j]) {
					return minSum;
				} else {
					minSum = sum + array[i][j];
					return minSum;
				}
			}
		}
		sum = sum + array[i][j];
		minSum = findMinSumPath(array, i + 1, j, sum, minSum);
		minSum = findMinSumPath(array, i, j + 1, sum, minSum);
		minSum = findMinSumPath(array, i + 1, j + 1, sum, minSum);
		return minSum;
	}

	public static void main(String arg[]) {
		int array[][] = new int[][] { { 1, 2, 3, }, { 6, 7, 1, }, { 2, 1, 5, }, };

		MinSumPathInMatrix msp = new MinSumPathInMatrix();
		System.out.println("Min Sum Path : "
				+ msp.findMinSumPath(array, 0, 0, 0, 0));
	}
}
