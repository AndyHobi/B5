package edu.wmich.cs1120.LA1;

import java.util.Random;

public class ProcessArray {

	private int[][] arr;
	private int[][] surrSumArr;

	private int col;
	private int row;

	/**
	 * @param width The width of the array
	 * @param height The height of the array 
	 */
	public ProcessArray(int width, int height) {

		col = width;
		row = height;

		arr = new int[col][row];
		surrSumArr = new int[col][row];
	}

	/**
	 * Fills the first array arr with random numbers [0,20]
	 */
	public void randomlyFillArray() {

		Random rand = new Random();

		for (int h = 0; h < row; h++) {
			for (int w = 0; w < col; w++) {
				arr[w][h] = rand.nextInt(15);
			}
		}
	}

	/**
	 * Computes the second array
	 */
	public void computeArrayValues() {

		for (int h = 0; h < row; h++) {
			for (int w = 0; w < col; w++) {

				int surrSum = 0;

				for (int r = h - 1; r < h + 2; r++) {
					for (int c = w - 1; c < w + 2; c++) {

						if ((r >= 0 && c >= 0) && (r < row && c < col)) {
							surrSum += arr[c][r];
						}

					}
				}
				surrSumArr[w][h] = surrSum - arr[w][h];
			}
		}
	}

	/**
	 * @param arr the 2D array to be printed
	 */
	public static void printArray(int[][] arr) {

		for (int h = 0; h < arr.length; h++) {
			for (int w = 0; w < arr[0].length; w++) {
				System.out.printf("%-4d", arr[h][w]);
			}
			System.out.println();
		}
	}

	/**
	 * @return The first array in the object
	 */
	public int[][] getFirstArray() {
		return arr;
	}

	/**
	 * @return The second Array in the object 
	 */
	public int[][] getSecondArray() {
		return surrSumArr;
	}

}
