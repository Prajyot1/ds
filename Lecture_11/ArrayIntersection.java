package Lecture_11;

import java.util.Arrays;

public class ArrayIntersection {
    public static void intersection(int[] input1 , int[] input2) {
        int n = input1.length;
        int m = input2.length;
        int i=0;
        int j=0;
        while(i<n & j<m){
            if(input1[i]==input2[j]){
                System.out.println(input1[i]);
                i++;
                j++;
            }
            else if (input1[i] < input2[j]) {
                i++;
            }
            else
                j++;
        }
    }
    public static void main(String[] args) {
        int[] array1= /* {2 ,6, 8, 5, 4, 3}; */ {2,6,1,2};
        int[] array2= /*{2 ,3 ,4 ,7};*/   {1,2,3,4,2};
        Arrays.sort(array1);
        Arrays.sort(array2);
        intersection(array1,array2);
    }
}
