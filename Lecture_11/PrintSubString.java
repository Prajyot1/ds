package Lecture_11;


public class PrintSubString {
    public static void printSubstring2(String str){
        for (int i = 1; i <= str.length() ; i++) {
            for (int j = 0; j <= str.length()-i; j++) {
                int end = j + i;
                //System.out.print(start+" ");
                //System.out.print(end+" ");
                System.out.println(str.substring(j,end));
            }
        }
    }
    public static void printSubstring(String str){
        int count = 0;
        for (int i = 0; i <= str.length() ; i++) {
            for (int j = i+1; j <= str.length() ; j++) {
                System.out.println(str.substring(i,j));
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String str = "abc";

        printSubstring2(str);
    }
}
