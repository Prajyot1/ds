package Lecture14Recursion;

public class IsArraySorted {
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static boolean checkSorted(int[] input){
        if(input.length <= 1){
            return true;
        }
        if(input[0] >= input[1]){
            return false;
        }
        int[] smallInput = new int[input.length-1];
        for (int i = 0; i < input.length-1; i++) {
            smallInput[i] = input[i+1];
        }
        printArray(input);
        boolean ans = checkSorted(smallInput);
        return ans;
    }
    public static boolean isSorted(int[] input, int index){
        if(index == input.length-1) return true;

        if(input[index] > input[index + 1]) return false;
        return isSorted(input, index+1);
    }
    public static void main(String[] args) {
        int[] array = {1,3,15,8,10};
//        System.out.println(checkSorted(array));
        System.out.println(isSorted(array,0));
    }
}
