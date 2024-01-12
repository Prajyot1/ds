package Practice_Recursion;

public class K_thSymbol_In_Grammer {
    public static int kthGrammar(int n, int k) {
        String ans = help(n);
        System.out.println(ans);

        return 0;
        // return Character.getNumericValue(
        //     ans.charAt(k));
    }
    private static String help(int n){
        // base
        if(n==1) return "0";
        // rec call
        String s = help(n-1);
        // cal
        String temp = "";
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == '0') temp = "01" + temp;
            else temp = "10"+ temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        int n = 1;
        int k = 1;
        System.out.println(kthGrammar(n,k));
    }
}
