package ProblemSetIV;

public class RatMazeProblem {

	public boolean solveMaze(int maze[][]) {
		return findMazePath(maze, 0, 0);
	}

	public boolean findMazePath(int maze[][], int i, int j) {
		if (i >= maze.length || j >= maze[0].length || i < 0 || j < 0)
			return false;
		if (maze[i][j] == 0)
			return false;
		if (i == maze.length - 1 && j == maze[0].length - 1)
			return true;

		return findMazePath(maze, i + 1, j) || findMazePath(maze, i, j + 1)
				|| findMazePath(maze, i, j - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 0, 0, 0 }, { 1, 0, 1, 0 }, { 0, 1, 0, 0 },
				{ 1, 1, 1, 1 } };

		RatMazeProblem boa = new RatMazeProblem();
		System.out.println(boa.solveMaze(maze));
	}

}
