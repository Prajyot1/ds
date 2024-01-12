package Practice_Recursion;

import java.util.Scanner;

public class TowerOFHanoi {
    public static void toweSol(int n  , String S , String M , String A){
        // base
        if(n == 0) return;
        toweSol(n-1,S , A , M);
        System.out.println(S + " -> "+ M);
        toweSol(n-1,A, M, S);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String Source = "A";
        String MoveTo = "B";
        String Auxilary = "C";

        toweSol(n , Source , MoveTo , Auxilary);
    }
}
