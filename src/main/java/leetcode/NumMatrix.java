package main.java.leetcode;

public class NumMatrix {

	int[][] matrix;

	public NumMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				matrix[i][j] += matrix[i][j - 1];
			}
		}
		this.matrix = matrix;
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		int sum = 0;
		if (col1 != 0) {
			col1 = col1 - 1;
		}
		for (int i = row1; i <= row2; i++) {
			sum += matrix[i][col2] - matrix[i][col1];
		}
		return sum;
	}
	
	public static void main(String args[]) {
		int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
              };
		NumMatrix numMatrix = new NumMatrix(matrix);
		System.out.println(numMatrix.sumRegion(2, 1, 4, 3));
		System.out.println(numMatrix.sumRegion(1, 1, 2, 2));
		System.out.println(numMatrix.sumRegion(1, 2, 2, 4));
	}
}
