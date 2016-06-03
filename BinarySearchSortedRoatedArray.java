package ProblemSetIV;

public class BinarySearchSortedRoatedArray {

	public boolean findElement(int arr[], int start, int end, int value) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == value)
				return true;
			if (arr[mid] <= arr[end]) {
				if (arr[mid] < value && value <= arr[end])
					start = mid + 1;
				else
					end = mid - 1;
			} else {
				if (arr[mid] > value && value >= arr[start])
					end = mid - 1;
				else
					start = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 6, 7, 1, 2, 3, 4, 5 };
		int value = 5;
		BinarySearchSortedRoatedArray bssr = new BinarySearchSortedRoatedArray();
		System.out.println(bssr.findElement(arr, 0, arr.length - 1, value));
	}

}
