package Lecture14Recursion;

public class IndexOfNumber {
    private static int findIndex(int[] array , int startIndex ,int target ){
        // base case
        if(startIndex >= array.length){
            return -1;
        }
        // check  or work
        if(array[startIndex]==target){
            return startIndex;
        }
        // recursion
        return findIndex(array,startIndex+1,target);

        // return index;
    }
    public static int findIndex(int[] input, int find){
        return findIndex(input ,0 ,find);
    }
    public static void main(String[] args) {
        int[] array = {9,8,10,8}; int find = 15;
        int ans = findIndex(array, find);
        if(ans==-1)
            System.out.println(" not found ");
        else
            System.out.println(ans);
    }
}
