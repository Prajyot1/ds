package Lecture15Recursion2;

public class PairStar {
    public static String addStar(String input){
        // base
        if (input.length() == 0) return "Empty String";
        if(input.length() == 1) return input;
        // recursion and calculation
        if (input.charAt(0) == input.charAt(1))
            return input.charAt(0) + "*" + addStar(input.substring(1));
        return input.charAt(0)  + addStar(input.substring(1));
    }
    public static void main(String[] args) {
//        String str = "hello";
        String str = "abcdss";
        System.out.println(addStar(str));
    }
}
