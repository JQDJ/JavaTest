package com.example.structure.sort;

import java.util.Arrays;
import com.example.*;

public class MergeSort {

	public void test(){
		System.out.println("mergeArray");
		int[] l1 = new int[]{1,3,4,7,87,99};
		int[] l2 = new int[]{3,5,6,8,90,789};
		int[] l3 = mergeArray(l1, l2);
		System.out.println("l1 = "+Arrays.toString(l1)+" l2 = "+Arrays.toString(l2)+" l3 = "+Arrays.toString(l3));
		
		System.out.println();
		System.out.println("mergeSort");
		int[] list = new int[] { 4, 2, 34, 5, 6, 7, 5, 4, 78, 234, 545, 12 ,229};		
		mergeSort(list);
		System.out.println("after = " + Arrays.toString(list));
	}

	private void mergeSort(int[] list) {
		System.out.print("gap " + 0 +" : ");
		Test.printList(list);
		for (int gap = 1; gap < list.length; gap = gap * 2) {			
			mergePass(list, gap, list.length);
			System.out.print("gap " + gap+" : ");
			Test.printList(list);
		}
	}
	
	private void mergePass(int[] list ,int gap,int len){
		int i = 0;
		for (i = 0; i + gap * 2 - 1 < len; i = i + gap * 2) {
			merge(list, i, i + gap - 1, i + gap * 2 - 1);
		}
		if (i + gap - 1 < len) {
			merge(list, i, i + gap - 1, len - 1);
		}
	}
	
	private void merge(int[] list, int s, int m, int t) {
		int len = t - s + 1;
		int[] temp = new int[len];
		int i = s, j = m + 1, k = 0;
		while (i <= m && j <= t) {
			if (list[i] < list[j]) {
				temp[k++] = list[i++];
			} else {
				temp[k++] = list[j++];
			}
		}
		while (i <= m) {
			temp[k++] = list[i++];
		}
		while (j <= t) {
			temp[k++] = list[j++];
		}
		for (int n = 0; n < len; n++) {
			list[s + n] = temp[n];
		}
	}
	
	//合并两个有序数组
	private int[] mergeArray(int[] mA, int[] mB) {
		int lA = mA.length;
		int lB = mB.length;
		int[] mC = new int[lA + lB];
		int i = 0, j = 0, k = 0;
		while (i < lA && j < lB) {
			if (mA[i] < mB[j]) {
				mC[k++] = mA[i++];
			} else {
				mC[k++] = mB[j++];
			}
		}
		while (i < lA) {
			mC[k++] = mA[i++];
		}
		while (j < lB) {
			mC[k++] = mB[j++];
		}
		return mC;
	}	
}
