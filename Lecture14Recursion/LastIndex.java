package Lecture14Recursion;

public class LastIndex {
    private static int findLastIndex(int[] array , int find ,int startIndex){
        int index = -1;
        // base case

        if(startIndex>=array.length-1){
            if (array[startIndex]==find)
                return startIndex;
            else
                return -1;
        }
        index = findLastIndex(array,find,startIndex+1);
        if (index==-1){
            if (array[startIndex]==find){
                return startIndex;
            }
        }
        return index;
    }
    public static int findLastIndex(int[] array , int find){
        return findLastIndex(array,find,0);
    }
    private static int lastIndxNewHelper(int[] input, int target, int length){
        if(length == 0) return -1;
        if(input[length] == target) return length;
        return lastIndxNewHelper(input,target,length-1);
    }
    // optimzed
    public static int lastIndexNew(int[] input, int target){
        return lastIndxNewHelper(input,target, input.length-1);
    }
    public static void main(String[] args) {
        int[] array = {9,5,8,10,8,55};
        int target = 8;
//        int ans = findLastIndex(array,target);
        int ans = lastIndexNew(array,target);
        System.out.println(ans);
    }
}
