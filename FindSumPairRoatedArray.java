package RePracticeAlgo;

public class FindSumPairRoatedArray {

	// perfect solution
	public boolean findSum(int array[], int sum) {
		int start = 0;
		int end = array.length - 1;
		while (array[start] > array[end]) {
			end--;
		}
		start = end++;
		while (start != end) {
			if (array[start] + array[end] == sum) {
				return true;
			} else if (array[start] + array[end] > sum) {
				start = start == 0 ? start = array.length - 1 : start - 1;

			} else if (array[start] + array[end] < sum) {
				end = end == array.length - 1 ? end = 0 : end + 1;
			}
		}

		return false;
	}

	public static void main(String arg[]) {
		FindSumPairRoatedArray spr = new FindSumPairRoatedArray();
		int array[] = { 4, 6, 7, 1, 2, 3 };
		System.out.println(spr.findSum(array, 8));
	}
}
