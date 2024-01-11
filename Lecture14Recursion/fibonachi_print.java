package Lecture14Recursion;

import java.util.Arrays;

public class fibonachi_print {

    public static int printFibonachi(int n , int[] arr){
        // base
        if(n == 0 | n == 1){
            arr[n] = n;
            return n;
        }
        int num1 = printFibonachi(n - 1 ,arr );
        int num2 = printFibonachi(n - 2 , arr);
        arr[n] = num1+num2;
        return num1 + num2;
    }
    public static int fib(int n){
        if(n==1 | n==0) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[6];
        printFibonachi(n , arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(fib(n));
    }
}
