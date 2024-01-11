package Lecture_11;

import java.util.Arrays;

public class PairSum {
    // brute force 
    public static void sumPair(int[] array , int target){
        int paircount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if((array[i]+ array[j] ==target)){
                    paircount++;
                }
            }
        }
        if(paircount>0)
            System.out.println(paircount);
        else
            System.out.println(" No pair Found ");
    }

    //method 2
    public static void pairSum2(int[] array,int sum){
        Arrays.sort(array);
        int count = 0;
        int start = 0;
        int end = array.length-1;
        while(start <= end){
            if ((array[start] + array[end]) < sum)
                start++;
            else if((array[start] + array[end]) == sum)
                count++;
            else //if((array[start] + array[end]) > sum)
                end--;
          start++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] array = {1 ,3 ,6 ,2 ,5 ,4 ,3 ,2 ,4}; int sum = 7;
        //int sum =12;
        //int[] array = {2 ,8 ,10 ,5 ,-2 ,5}; int sum = 10;
        //sumPair(array ,sum);
        pairSum2(array,sum);
    }
}
