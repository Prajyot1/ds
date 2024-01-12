package Lecture17Recurson3;

public class StairCase {
    public static int countWays(int n , int start){
        // base
        // can also be done without using start
        // just minus the n by 1 , 2 , 3;  n -1 , n- 2,n -3 ; recursive call
        if (start == n) return 1;
        if (start > n) return 0;
        // recursive call
        int n1 = countWays(n, start + 1);
        int n2 = countWays(n, start + 2);
        int n3 = countWays(n, start + 3);
        return n1 + n2 + n3;
    }
    public static void main(String[] args) {
        int n = 5; // no of staircase
        // count no of possible ways to climb staircase if can hop 1 ,2,3 step at one time
        System.out.println(countWays(n , 0));
    }
}
