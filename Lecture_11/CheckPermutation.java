package Lecture_11;

public class CheckPermutation {
    public static boolean findIfPermutation(String s1 , String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        // create empty array to store frequency of all alphabates
        int [] frequency = new int[256];

        for (int i = 0; i < 256; i++) {
            frequency[i] = 0;
        }
//        // code here
        for (int i = 0; i < s1.length(); i++) {
            char ch  = s1.charAt(i);
            ++frequency[ch];
        }
        for (int i = 0; i < s2.length() ; i++) {
            char ch = s2.charAt(i);
            --frequency[ch];
        }

        for (int i = 0; i < 256; i++) {
            if (frequency[i] != 0)
                return false;
        }
    return true;
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "baedc";

        boolean ans = findIfPermutation(str1, str2);
        System.out.println(ans);
    }
}
