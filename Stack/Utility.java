package Stack;

import java.util.Scanner;
import java.util.Stack;
// stack is pass by reference
public class Utility {
    public static void checkStack(Stack s){
        s.pop();
        s.pop();
        s.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int input;
        System.out.println("Enter Elements ");
        input = sc.nextInt();
        while (input != -1){
            input = sc.nextInt();
            s.push(input);
        }
        checkStack(s);
        System.out.println(s.peek());
    }// 10 20 30 40 50 -1
}
