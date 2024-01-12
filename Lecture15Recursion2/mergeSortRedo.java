package Lecture15Recursion2;

import java.util.Arrays;

public class mergeSortRedo {
    public static void mergeSort(int[] input){
        mergeSortHelp(input,0,input.length-1);
    }
    public static void mergeSortHelp(int[] input , int start , int end){
        // base
        if (start>=end) return;
        int mid = (start + end) / 2;

        // call
        mergeSortHelp(input,start,mid);
        mergeSortHelp(input,mid+1,end);
        merge(input,start,mid,end);
    }
    public static void merge(int[] input , int start , int mid , int end){
        int i = start;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[(end - start) + 1];
        while (i <= mid && j <= end){
            if (input[i] <= input[j]) {
                temp[k++] = input[i++];
            }else temp[k++] = input[j++];
        }

        while(i <= mid) temp[k++] = input[i++];
        while(j <= end) temp[k++] = input[j++];

        for (int l = start; l <= end  ; l++) {
            input[start] = temp[l - start];
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
