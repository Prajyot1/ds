package Lecture_11;

import java.util.Arrays;

public class TripleSum {
    public static int sumTriplePair(int[] array , int target){
        int count =0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length; k++) {
                    if(array[i]+array[j]+array[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int sumTriplePair1(int[] array,int target){
        int count =0;
        Arrays.sort(array);
        for (int i = 0; i < array.length-2; i++) {
            int sum = target - array[i];
            int start = i+1;
            int end = array.length-1;
            while(start < end){
                if(array[start] + array[end] == sum){
                    count++;
                } else if (array[start] + array[end] < sum) {
                    start++;
                }
                else if (array[start] + array[end] > sum){
                    end --;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //int[] array = {1 ,2 ,3 ,4 ,5 ,6 ,7}; int target = 19; // int target =12;
        int[] array = {2 ,-5 ,8 ,-6 ,0 ,5 ,10 ,11 ,-3}; int target = 10;
        //int ans = sumTriplePair(array,target);
        int ans = sumTriplePair1(array,target);
        System.out.println(ans);
    }

}
