package com.example.structure.sort;

import java.util.Arrays;

import com.example.Test;

public class SelectionSort {

	public void test(){
		int[] list = new int[] { 4, 3, 2, 1 };
		System.out.println("before = " + Arrays.toString(list)+" len = "+list.length);
		selectionSort(list);
		System.out.println("after = " + Arrays.toString(list)+" len = "+list.length);
	}
	
	private void selectionSort(int[] list){
		int temp,index;
		for (int i = 0; i < list.length - 1; i++) {		
			index = i;
			for (int j = i + 1; j < list.length; j++) {
				if(list[index] > list[j]){
					index = j;
				}
			}
			temp = list[index];
			list[index] = list[i];
			list[i] = temp;
			
			System.out.print("i = "+i+" : ");
			Test.printList(list);
		}
	}
}
