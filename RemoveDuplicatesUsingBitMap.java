package ProblemSetIV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicatesUsingBitMap {

	public void removeDuplicatesList(ArrayList<Integer> list) {
		int bitmap = 0;
		Iterator it = list.iterator();
		while (it.hasNext()) {
			int element = (int) it.next();
			int exist = 1 << element;
			exist = bitmap & exist;
			exist = exist >>> element;
			if (exist == 0) {
				int temp = (1 << element);
				bitmap = temp ^ bitmap;
				//System.out.println(Integer.toBinaryString(bitmap));
			} else {
				it.remove();
			}
		}
		System.out.println(list);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		int arr[] = { 30, 1, 1, 4, 1, 5, 7, 4, 6, 5, 8 };

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		RemoveDuplicatesUsingBitMap bit = new RemoveDuplicatesUsingBitMap();
		bit.removeDuplicatesList(list);
	}

}
