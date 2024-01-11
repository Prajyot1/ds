package Lecture14Recursion;

public class CalPowerRecursion {
    public static int calPower(int n, int p) {
        if(p==1){
            return n;
        }
        return (n * calPower(n,p-1));
    }
    public static void main(String[] args) {
        int number =2;
        int power = 10;
        int ans  = calPower(number, power);
        System.out.println(ans);
    }
}
