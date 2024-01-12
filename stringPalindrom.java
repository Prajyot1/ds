public class stringPalindrom {
    public static boolean checkStringIsPalindrom(String str , int strt , int last){
        if(strt == str.length()/2){   // if(strt > last) return true;
            return true;
        }
        if(str.charAt(strt)==str.charAt(last)){
            boolean is = checkStringIsPalindrom(str,strt+1,last-1);
            return (true & is);
        }
        else
            return false;
    }
    public static boolean checkStringIsPalindrom(String str){
        int Strindex = 0;
        int lasIndex = str.length()-1;
        return checkStringIsPalindrom(str,Strindex , lasIndex);
    }
    public static void main(String[] args) {
        //String s = "racecar";
        //String s = "ninja";
        String s = "malayalam";
        //String s = "ab";
        System.out.println(checkStringIsPalindrom(s));

    }
}
