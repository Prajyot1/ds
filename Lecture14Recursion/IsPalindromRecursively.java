package Lecture14Recursion;

public class IsPalindromRecursively {
    private static String isPalindromeHelper(String s , String s1,int endIndex){
        if(endIndex < 0) return s1;
        return s.charAt(endIndex) + isPalindromeHelper(s,s1,endIndex-1);
    }
    public static boolean isPalindrome(String s){
        String ans = isPalindromeHelper(s, "",s.length()-1);
        return ans.equals(s);
    }
    public static void main(String[] args) {
//        String s = "racecar";
        String s = " ninja";
        System.out.println(isPalindrome(s));
    }
}
