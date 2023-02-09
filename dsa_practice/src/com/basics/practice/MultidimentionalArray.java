package com.basics.practice;

public class MultidimentionalArray {

	public static void main(String[] args) {

		int[][] grid = { { 1, 2, 3 }, { 7, 8 }, { 12, 23, 34 } };
		for (int i = 0; i < grid.length; i++) {		//this loop runs through the x axis.
			for (int j = 0; j < grid[i].length; j++) {	// this loop runs through the y axis.
				System.out.print(grid[i][j] + "\t");  // the "println" is changed to "print" to produce output in new lines
			}
			System.out.println();
		}

	}

}
