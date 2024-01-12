package Practice_Recursion;

public class Perfect_square {
    public static int perfect(int num){
        // base
        if (num < 4) return num;
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i * i <= num ; i++) {
            int square = i*i;
            ans = Math.min(ans , 1 + perfect(num-square));
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(perfect(n));
    }
}
