package Lecture_11;

import java.util.Objects;

public class PalindromString {
    public  static boolean checkPalindromString(String StringToCheck){
        String rev ="";
        for (int i = StringToCheck.length()-1; i >=0 ; i--) {
            rev += StringToCheck.charAt(i);
            //System.out.print(StringToCheck.charAt(i));
        }
        if(rev.contentEquals(StringToCheck))
            return true;
    return false;
    }
    public  static boolean checkPalindromString2(String StringToCheck){
        int left = 0 ;
        int right = StringToCheck.length()-1;
            while (left < right){
                if(StringToCheck.charAt(left) != StringToCheck.charAt(right))
                    return false;
                left++;
                right--;

            }
            return  true;
        }

        public static void main(String[] args) {
        String str = "malayalam";
        //System.out.println(checkPalindromString(str));
        System.out.println(checkPalindromString2(str));

    }
}
