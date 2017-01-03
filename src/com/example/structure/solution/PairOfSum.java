package com.example.structure.solution;

public class PairOfSum {

	public void test() {
		int[] list = new int[] { 2, 3, 356, 3, 45, 5, 6, 7, 8, 34, 56, 878678, 23, 4, 1 };
		printpairs(list, 6);
	}

	private void printpairs(int[] list, int sum) {
		boolean[] map = new boolean[8786787];
		int maxIndex = list.length - 1;
		int temp;
		for (int i = 0; i < maxIndex; i++) {
			temp = sum - list[i];
			if (temp >= 0 && map[temp]) {
				System.out.println("pair : [ " + temp + " , " + list[i] + " ]");
			}
			map[list[i]] = true;
		}
	}
	
}
