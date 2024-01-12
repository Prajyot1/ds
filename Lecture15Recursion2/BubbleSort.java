package Lecture15Recursion2;

public class BubbleSort {
    public static void sortBubbleRecursively(int[] arr , int i , int j){
        if(i == arr.length - 2 ) return;
        if(j == arr.length - 1) sortBubbleRecursively(arr,i+1,0);
        if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
        sortBubbleRecursively(arr,i,j+1);
    }
    public static void main(String[] args) {
        int[] arr = {4,8,9,2};
        sortBubbleRecursively(arr,0,0);
        System.out.println(arr);
    }
}
