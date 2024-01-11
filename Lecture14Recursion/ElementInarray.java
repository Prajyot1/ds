package Lecture14Recursion;

public class ElementInarray {
    public static boolean checkElement(int[] input ,int startIndex, int find){
        if(input[startIndex]==find){
            return true;
        }
        else if (startIndex==input.length-1){
            return false;
        }
        return checkElement(input,startIndex+1,find);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5}; int target = 10;
        boolean IsPresent = checkElement(array,0,target);
        System.out.println(IsPresent);
    }
}
