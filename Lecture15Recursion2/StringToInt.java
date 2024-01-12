package Lecture15Recursion2;

public class StringToInt {
    public static int toInt1(String str){
        if(str.length() == 1) return (str.charAt(0) - '0');
        int smAns = str.charAt(0) - '0';
        smAns *= Math.pow(10,str.length()-1);
        return smAns + toInt1(str.substring(1));
    }
    public static int toInt2(String str){
        // base
        if(str.length() == 1) return str.charAt(0) - '0';
        // recursion
        int smAns = toInt2(str.substring(0,str.length()-1));
        // cal
        int laDig = str.charAt(str.length()-1) - '0';
        return (smAns * 10) + laDig;
    }
    public static void main(String[] args) {
        String str = "1245";
        if(str.length() > 0){
            int ans = toInt2(str);
            System.out.println(ans);
        }
        else System.out.println("empty string");
    }
}
