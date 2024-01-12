package Practice_Recursion;

import java.util.Arrays;

public class SelectionSortRecursively {
    public static void selection(int[] input , int index){
        // base
        if (index == input.length) return;
        // recursion call to find index of minValue in array
        int minIndex = findMin(input,index);

        // swap and create a small sorted array part
        int temp = input[minIndex];
        input[minIndex] = input[index];
        input[index] = temp;

        // recursion call for next index
        selection(input,index+1);
    }
    public static int findMin(int[] arr , int ind){
        // base
        if (ind == arr.length-1) return ind;
        // rec call
        int smAns = findMin(arr,ind+1);
        if (arr[smAns] < arr[ind]) return smAns;
        else return ind;
    }
    public static void main(String[] args) {

        int[] input = {4,2,3,45,22,10,0,2,2,4};
        System.out.println("Array Before Sorting");
        System.out.println(Arrays.toString(input));
        selection(input,0);
        System.out.println("Array After Sorting");
        System.out.println(Arrays.toString(input));

    }
}
