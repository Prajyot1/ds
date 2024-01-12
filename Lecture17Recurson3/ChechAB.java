package Lecture17Recurson3;

public class ChechAB {
    public static boolean check(String str){
        // base
        if (str.length()==0) return true;
        // cal
       if (str.charAt(0) == 'a'){
           if(str.substring(1).startsWith("a") || str.substring(1).startsWith("bb") ||
            str.length() == 1) check(str.substring(3));
           else check(str.substring(1));

       }
        return false;
    }
    public static void main(String[] args) {
        String s = "abb";
    }
}
