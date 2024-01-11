package Lecture14Recursion;

public class sumOfArray {
    public static int sum(int[] array){
        int sum1 = 0;
        if(array.length==1){
            return array[0];
        }
        int[] small = new int[array.length-1];
        for (int i = 0; i < array.length-1; i++) {
            small[i]=array[i+1];
        }
        sum1 = sum1 + array[0]+sum(small);
        return sum1;
    }
    // method 2
    public static int sum2(int[] input,int startIndex){
        int sumOfarray=0;
        if (startIndex==input.length-1){
            return input[startIndex];
        }
        sumOfarray += input[startIndex] + sum2(input,startIndex+1);
    return sumOfarray;
    }
    public static int sum3(int[] input, int index){
        // base
        if(index == input.length - 1) return input[index];
        return input[index] + sum3(input, index+1);
    }
    public static void main(String[] args) {
        //int[] array = {9,8,9};
        int[] array = {4,2,1};
        //int[] array = {1,20,10,10,10};
        //int ans = sum(array);

        //System.out.println(ans);
        int total  = sum3(array,0);
        System.out.println(total);
    }
}
