package com.example.structure.search;

import java.util.Arrays;


/**
 * Created by Sven.Zhan on 2016/11/17.
 */

public class BinarySearch {

    private String TAG = BinarySearch.class.getSimpleName();

    public void test(){
		int[] list = new int[] { 1, 2, 3, 3, 3, 4, 5, 6, 7, 12, 13, 34, 56, 78, 99 };
		System.out.println("list = "+Arrays.toString(list));
		
		int firstIndex = firstIndex(list, 3);
		System.out.println("firstIndex = "+firstIndex);
		
		int firstGreat = firstGreat(list, 3);
		System.out.println("firstGreat = "+firstGreat);
    }

    //1.1����ĳ�������±꣨����һ����
    private int binarySearch(int[] list,int key){
		int l = 0, r = list.length - 1;
		int mid;		
		while(l <= r){
			mid = l + ((r - l) >> 1);
			if(list[mid] < key){
				l = mid + 1;
			}else if(list[mid] > key){
				r = mid - 1;
			}else{
				return mid;
			}
		} 
		return -1;
    }
    
    //1.2���ҵ�һ�����ڵ���ĳ�������±�
	private int firstGreatOrEqual(int[] list, int key) {
		int l = 0, r = list.length - 1;
		int mid;
		while (l <= r) {
			mid = l + ((r - l) >> 1);
			if (list[mid] < key) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return l < list.length - 1 ? l : -1;
	}
	
	//1.3���ҵ�һ������ĳ�������±�
	private int firstGreat(int[] list,int key){
		int l = 0,r = list.length - 1;
		int mid;
		while(l <= r){
			mid = l + ((r - l) >> 1);
			if(list[mid] <= key){
				l = mid + 1;
			}else{
				r = mid - 1;
			}
		}		
		return (l < list.length - 1 && list[l] > key) ? l : -1;
	}
	
	//2.1 ����������ĳ������λ�õ���С�±꣬û�з���-1
	private int firstIndex(int[] list,int key){
		int l = 0,r = list.length - 1;
		int mid;
		while(l <= r){
			mid = l + ((r - l) >> 1);
			if(list[mid] < key){
				l = mid + 1;
			}else{
				r = mid - 1;
			}
		}		
		return (l < list.length - 1 && list[l] == key ) ? l : -1;
	}
	
	
}
