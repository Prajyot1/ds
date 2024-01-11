package Lecture_11;

public class CountWords {
    public static void main(String[] args) {
        String str = "some thing is written";
        int words = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.isEmpty()){
                System.out.println(" Empty String ");
                break;
            }
            if (str.charAt(i)==' '){
                words++;
            }
        }
        System.out.println("No of words :" + words);
    }
}
