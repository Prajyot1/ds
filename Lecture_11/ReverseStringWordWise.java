package Lecture_11;

public class ReverseStringWordWise {

    // utilities functons
//    public static void printString(String strNew,int startIndex , int endIndex){
//        System.out.print(strNew.substring(startIndex,endIndex));
//    }



    // main function



    public static String reverseStringWord(String str){
        int start=0;
        int end=str.length();
        String output="";
        for (int i = str.length()-1; i > 0 ; i--) {
            if(str.charAt(i)==' '){
                start = i+1;
                //printString(str, start , end);
                //System.out.print(' ');
                output = output + str.substring(start,end)+" ";
                end = start-1;
            }
        }
        output +=str.substring( 0, end);
        //printString(str,0,end);
        return output;
    }
    public static void main(String[] args) {
        String str = "Reverse This String You Mother Fucker";
        // reverseStringWord(str);

        System.out.println(reverseStringWord(str));

    }
}
