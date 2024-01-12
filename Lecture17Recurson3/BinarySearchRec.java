package Lecture17Recurson3;

public class BinarySearchRec {
    public static int binarySearch(int[] input ,int target){
        int n = input.length - 1;
        return binarySearchHelp(input,target,0,n);
    }
    public static int binarySearchHelp(int[] input , int target , int st , int ed){
        // base
        if(st > ed){
            return -1;
        }

        int mid = (st + ed) / 2;

        if (input[mid] == target){
            return mid;
        }
        else if (input[mid] > target) binarySearchHelp(input,target,st,--mid);
        else binarySearchHelp(input,target,++mid ,ed);
    return 10;
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
//        int[] arr = {1,2,3,4,5,6,7,8,9};

        int target = 2;

        System.out.println(binarySearch(arr,target));
    }
}
