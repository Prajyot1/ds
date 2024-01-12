package Lecture17Recurson3;

import java.util.Arrays;

public class Subsequences {
    public static String[] subSequence(String str){
        // base
        if(str.length() == 0) {
            String[] ans = {""};
            return ans;
        }
        // recursion
        String[] smAns = subSequence(str.substring(1));
        // cal
        String[] ans = new String[smAns.length * 2];
        for (int i = 0; i < smAns.length; i++) {
            ans[i] = smAns[i];
        }
        int j = 0;
        for (int i = smAns.length; i < ans.length; i++) {
            ans[i] = str.charAt(0) + smAns[j++] ;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "abc";
        String[] ans = subSequence(str);
        System.out.println(Arrays.toString(ans));
    }
}
