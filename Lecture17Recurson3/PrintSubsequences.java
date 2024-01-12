package Lecture17Recurson3;

public class PrintSubsequences {
    public static void printSubSequenceHelp(String input , String outPutSofar){
        if (input.length()==0){
            System.out.print(outPutSofar + " ");
            return;
        }
        // we choose not to include the first character
        printSubSequenceHelp(input.substring(1),outPutSofar);
//        outPutSofar += input.charAt(0);
        printSubSequenceHelp(input.substring(1),outPutSofar + input.charAt(0) );
    }

    public static void printSubSequence(String input){
        printSubSequenceHelp(input,"");
    }

    public static void main(String[] args) {
        String str = "xyz";
        printSubSequence(str);
    }
}
