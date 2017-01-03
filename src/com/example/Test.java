package com.example;

import com.example.structure.sort.*;

public class Test {

    public static void main(String[] args){    	
    	new SelectionSort().test();  
    }
    
	
	public static void printList(int[] list) {
		for (int value : list) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}
}
