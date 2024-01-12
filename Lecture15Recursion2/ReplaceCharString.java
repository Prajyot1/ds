package Lecture15Recursion2;


public class ReplaceCharString {
    public static String replace(String str , char a,char b){
        String ans= "";
        if(str.length()==0){
            return str;
        }
        if (str.charAt(0) == a){

            return   b + replace(str.substring(1), a, b);
        }
        return  str.charAt(0) + replace(str.substring(1), a, b);
    }
    public static void main(String[] args) {
        String input = "abacd";
        char change = 'a';
        char changeWith = 'x';
        System.out.println(replace(input,change,changeWith));
    }

}
