package Lecture15Recursion2;

public class MergeSort {
    public static void print(int[] array){
        for (int x: array) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] array , int start , int end){
        int n = (end - start) + 1;
        int mid = array.length/2;
        int i = start;
        int j = mid;
        int index = 0;
        int[] arr = new int[n];
        while ((i <= mid) & (j <= end)){
            if (array[i] < array[j]){
                arr[index] = array[i];
                i++;
            }
            else{
                arr[index]=array[j];
                j++;
            }
            index++;
        }
      print(arr);
        return;
    }

    public static void sort(int[] array , int start , int end) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;

        sort(array, 0, mid);
        sort(array, mid + 1, end);

        mergeSort(array,start,end);

    }
    public static void main(String[] args) {
        int[] array = {8,5,3,5};
        sort(array,0, array.length-1);
        //print(array);
    }
}
