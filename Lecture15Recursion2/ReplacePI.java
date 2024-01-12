package Lecture15Recursion2;

public class ReplacePI {
    public static String replacePi(String s){
        if(s.length() == 0) return "";
        if(s.length() > 1){
            if(s.charAt(0) == 'p' && s.charAt(1) == 'i')
                return 3.14 + replacePi(s.substring(2));
        }
        return s.charAt(0) + replacePi(s.substring(1));
    }
    public static void main(String[] args) {
        String str = "pi";
        System.out.println(replacePi(str));
    }
}
