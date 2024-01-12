package Practice;

import java.util.Arrays;

public class CyclicSort {
    public static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int curr = arr[i];
            if(curr != i+1){
                // swap
                arr[i] = arr[curr-1];
                arr[curr-1] = curr;
            }else i++;
        }
    }
    public static void main(String[] args) {
        int[] input = {3,1,5,4,2};
        //int[] input = {2,6,4,3,1,5};
        //int[] input = {1,5,4,3,2};
        sort(input);
        System.out.println(Arrays.toString(input));
    }
}
