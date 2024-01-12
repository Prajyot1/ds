package Lecture15Recursion2;

public class RemoveDublicateChar {
    public static String remove(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
            return remove(str.substring(1));
        }
        else
            return str.charAt(0) + remove(str.substring(1));
    }
    public static String remove2(String str , char prev){
        if(str.length() == 0) return "";
        if (str.charAt(0) != prev)
            return str.charAt(0)+ remove2(str.substring(1),str.charAt(0));
        return remove2(str.substring(1), str.charAt(0));
    }
    public static void main(String[] args) {
        //String str = "aabccba";
        String str = "aaaaaaaa";
        char ch = Character.MIN_VALUE;
        System.out.println(remove(str));
//        System.out.println(remove2(str , ch));
    }
}
