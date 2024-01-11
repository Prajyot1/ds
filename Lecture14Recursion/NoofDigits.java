package Lecture14Recursion;

public class NoofDigits {
    public static int findDigits(int num){
        int count =1;
        num = num /10;
        if(num==0){
            return 1;
        }
        count += findDigits(num);
        return count;
    }
    public static int digitLength(int n){
        if(n < 10) return 1;
        return 1 + digitLength(n / 10);
    }
    public static void main(String[] args) {
        int n = 123456789;
        int ans =0;
        if(n>0)
//             ans = findDigits(n);
            ans = digitLength(n);
        System.out.println(ans);
    }
}
