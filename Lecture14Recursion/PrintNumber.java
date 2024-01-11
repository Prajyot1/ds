package Lecture14Recursion;

public class PrintNumber {
    public static int printNum(int num){
        if(num==1){
            System.out.print(1+" ");
            return 1;
        }
        int toprint =(1+printNum(num-1));
        System.out.print(toprint +" ");
    return toprint;
    }
    public static void printN(int num){
        if(num == 1){
            System.out.print(num + " ");
            return;
        }
        printN(num - 1);
        System.out.print(num+" ");
        return;
    }

    public static void main(String[] args) {
        int n = 100;
//        printNum(n);
        printN(n);
    }
}
