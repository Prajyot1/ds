package Lecture14Recursion;

public class Multiplication {
    private static int multiplyMain(int a,int b){
        int total = 0;
        if(a==1){
            return b;
        }
        return b + multiplyMain(a-1,b);
    }
    public static int multiply(int a  , int b){
        if(a <= b){
            return multiplyMain(a,b);
        }
        else
            return multiplyMain(b,a);
    }
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 100;
        int ans = multiply(num1,num2);
        System.out.println(ans);
    }
}
