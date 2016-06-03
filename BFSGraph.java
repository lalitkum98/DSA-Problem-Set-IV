package RePracticeAlgo;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
	public void TraverseBFS(int array[][], int visited[], int startVertex,
			Queue queue) {
		while (!queue.isEmpty()) {
			startVertex = (int) queue.element();
			visited[startVertex] = 1;
			System.out.println(startVertex + " ");
			queue.remove();
			for (int k = 0; k < array.length; k++) {
				if (visited[k] != 1 && array[startVertex][k] == 1) {
					queue.add(k);
				}
			}
			TraverseBFS(array, visited, 0, queue);
		}

	}

	public static void main(String[] args) {
		BFSGraph bfs = new BFSGraph();
		Queue queue = new LinkedList();
		queue.add(2);
		int visited[] = new int[4];
		int array[][] = new int[][] { { 0, 1, 1, 0 }, { 0, 0, 1, 0 },
				{ 1, 0, 0, 1 }, { 0, 0, 0, 1 }, };
		bfs.TraverseBFS(array, visited, 2, queue);

	}

}
