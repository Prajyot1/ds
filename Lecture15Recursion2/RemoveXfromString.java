package Lecture15Recursion2;

public class RemoveXfromString {
    public static String removeX(String str){
        if(str.length()==0){
            return str;
        }
        if(str.charAt(0) != 'x'){
            return str.charAt(0) + removeX(str.substring(1));
        }
        return removeX(str.substring(1));
    }
    public static void main(String[] args) {
        //String str = "xccxxcc";
        String str = "xxabcxxdxexfghx";
        System.out.println(removeX(str));
    }
}
