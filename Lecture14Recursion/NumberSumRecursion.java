package Lecture14Recursion;

public class NumberSumRecursion {
    public static int findSum(int num){
        if(num <= 0){
            return 0;
        }
        else
            return (num % 10) + findSum(num/10);
    }
    public static void main(String[] args) {
        //int num = 12345;
        //int num = 9;
        //int num = 1111111;
        int num = 987654321;

        int ans = findSum(num);
        System.out.println(ans);
    }
}
