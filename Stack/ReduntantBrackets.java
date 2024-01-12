package Stack;

import Lecture_18OOPS.ComplexNo;

import java.util.Stack;

public class ReduntantBrackets {
 public static int checkCount(Stack<Character> st , char ch){
     int count = 0;
     Stack<Character> temp = st;
     if (ch == ')')
         ch = '(';
     if (ch == ']')
         ch = '[';
     if (ch == '}')
         ch = '{';
     char poped = temp.pop();

     while (ch != poped){
         count++;
         poped = temp.pop();
     }
     return count;
 }
    public static boolean brackets(String str){
        Stack<Character> st = new Stack<>();
        char curr;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            curr = str.charAt(i);
            st.push(curr);
        }
        while (!st.isEmpty()){
            curr = st.pop();
            if ( curr == ')' | curr == ']' | curr == '}'  )
                count = checkCount(st , curr);
            else
                continue;
            if (count <= 1)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "((a+b))";
        System.out.println("Expression is Redundant :");
        System.out.println(brackets(s));
    }
}
