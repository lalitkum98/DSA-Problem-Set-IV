package RePracticeAlgo;

public class DFSGraph {
	public void TraverseDFS(int array[][], int visited[], int startVertex) {
		visited[startVertex] = 1;
		System.out.println(startVertex + " ");
		for (int k = 0; k < array.length; k++) {
			if (visited[k] != 1 && array[startVertex][k] == 1) {
				TraverseDFS(array, visited, k);
			}
		}

	}

	public static void main(String arg[]) {
		DFSGraph dfs = new DFSGraph();

		int visited[] = new int[4];
		int array[][] = new int[][] { { 0, 1, 1, 0 }, { 0, 0, 1, 0 },
				{ 1, 0, 0, 1 }, { 0, 0, 0, 1 }, };
		dfs.TraverseDFS(array, visited, 2);

	}
}
