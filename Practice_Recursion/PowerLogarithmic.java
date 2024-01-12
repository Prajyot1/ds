package Practice_Recursion;
// T(logN)
// T(logN)
public class PowerLogarithmic {
    public static int findPower(int num , int power){
        // base
        if (power == 1) return num;
        //call
        int smAns = findPower(num , power/2);
        if (power % 2 == 0)
            return smAns * smAns;
        else
            return smAns * smAns * num;
    }
    public static void main(String[] args) {
        int n = 4;
        int power = 3;
        int ans = findPower( n , power);
        System.out.println(ans);
    }
}
