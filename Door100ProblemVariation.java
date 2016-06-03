package ProblemSetIV;

import java.util.ArrayList;

public class Door100ProblemVariation {
	// All bulbs are initaly switch off "0" find the the state of bulbs after
	// nth opertaion,eg
	// 1st 1 1 1 1 change only 1*ith
	// 2nd 1 0 1 0 change only 2*ith
	// 3rd 1 0 0 0 change only 3*ith
	// 4th 1 0 0 1 change only 4th * ith
	public int lightingBulbs(int bulbsCount) {
		ArrayList<Integer> bulbsArray = new ArrayList<Integer>();
		for (int x = 0; x < bulbsCount; x++) {
			bulbsArray.add(0);
		}
		ArrayList<Integer> solvedBulbsArray = puzzleSolver(bulbsArray,
				bulbsCount);
		int onBulbCount = 0;
		for (int x = 0; x < bulbsCount; x++) {
			if (solvedBulbsArray.get(x) == 1)
				onBulbCount++;
		}
		return onBulbCount;
	}

	public ArrayList<Integer> puzzleSolver(ArrayList<Integer> bulbsArray,
			int bulbsCount) {
		for (int x = 0; x < bulbsCount; x++) {
			int i = x + 1;
			//System.out.println(bulbsArray);
			for (int y = 1; y < bulbsCount + 1; y++) {
				if (0 == y % i) {
					Integer door = bulbsArray.get(y - 1);
					if (door == 0)
						door = 1;
					else
						door = 0;
					bulbsArray.set(y - 1, door);
				}
			}
		}
		//System.out.println(bulbsArray);
		return bulbsArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Door100ProblemVariation door = new Door100ProblemVariation();
		System.out.println(door.lightingBulbs(4));
	}

}
