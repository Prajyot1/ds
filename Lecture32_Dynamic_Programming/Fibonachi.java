package Lecture32_Dynamic_Programming;

public class Fibonachi {
    public static int fibonachiDp(int n , int [] arr){
        // base case

        if ( n==0 | n==1 ){
            return n;
        }

        int n1 , n2;

        if (arr[n-1] == -1){
            n1 = fibonachiDp(n-1 ,arr);
            arr[n-1] = n1;
        }
        else
            n1 = arr[n-1];

        if (arr[n-2] == -1){
            n2 = fibonachiDp(n-2 , arr);
            arr[n-2] = n2;
        }else
            n2 = arr[n-2];

        int ans = (n1 + n2);
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        int ans = fibonachiDp(n , arr);
        System.out.println(ans);
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
}
