package com.example.structure.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Sven.Zhan on 2016/11/17.
 */

public class QuickSort {

    private String TAG = QuickSort.class.getSimpleName();

    public void test(){
        int len = 20;
        int[] list = new int[len];
        Random random = new Random();
        for(int i = 0;i<len;i++){
            list[i] = random.nextInt(500);
        }
        String beforeSort = Arrays.toString(list);
        System.out.println(" beforeSort = "+beforeSort);
        quickSort1(list,0,len - 1);
        String afterSort = Arrays.toString(list);
        System.out.println(" afterSort = "+afterSort);
    }

    public void quickSort1(int[] list,int l,int r){
        if (l < r) {
            int i = l, j = r;
            int x = list[l];
            while (i < j) {
                while (i < j && list[j] >= x) {
                    j--;
                }
                if (i < j) {
                    list[i] = list[j];
                    i++;
                }
                while (i < j && list[i] < x) {
                    i++;
                }
                if (i < j) {
                    list[j] = list[i];
                    j--;
                }
            }
            list[i] = x;
            quickSort1(list, l, i - 1);
            quickSort1(list, i + 1, r);
        }
    }
}
