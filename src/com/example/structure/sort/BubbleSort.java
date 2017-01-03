package com.example.structure.sort;

import java.util.Arrays;

import com.example.Test;

public class BubbleSort {

	public void test(){
		//int[] list = new int[] { 4, 2, 34, 5, 6, 7, 5, 4, 78, 234, 545, 12 ,229};
		//int[] list = new int[] { 4, 3, 2, 1 };
		int[] list = new int[] { 1, 2, 3, 4 };
		System.out.println("before = " + Arrays.toString(list)+" len = "+list.length);
		bubbleSort2(list);
	}
	
	
	//常规方案
	private void bubbleSort(int[] list){
		int temp,len = list.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = len - 1; j > i; j--) {
				if (list[j] < list[j - 1]) {
					temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
//					System.out.print("["+j+"] ");
				}
			}
			System.out.print("i = "+i+" : ");
			Test.printList(list);
		}
	}
	
	//优化方案
	private void bubbleSort2(int[] list){
		int temp;
		boolean exchange;
		for(int i = 0;i < list.length - 1;i++){
			exchange = false;
			for(int j = list.length - 1;j > i;j--){
				if(list[j] < list[j - 1]){
					temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
					exchange = true;
				}
			}			
			System.out.print("i = "+i+" : ");
			Test.printList(list);
			if(!exchange){
				break;
			}
		}
	}
	
}
