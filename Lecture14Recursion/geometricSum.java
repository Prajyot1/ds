package Lecture14Recursion;


public class geometricSum {
    public static strictfp double sum(double num){
        if(num == 0){
            return 1;
        }
        return (1/(Math.pow(2,num))) + sum(num-1);
    }
    public static void main(String[] args) {
        double k = 4;
        double ans = sum(k);
        System.out.println(ans);
    }
}
