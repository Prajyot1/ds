package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static Stack<Integer> reverseRecursive(Stack<Integer> s){
        Stack<Integer> temp = new Stack<>();
        int tempInt;
        if (s.isEmpty())
            return s;

        int poped = s.pop();
        s = reverseRecursive(s);


        while (!s.isEmpty()){
            tempInt = s.pop();
            temp.push(tempInt);
        }

        s.push(poped);

        while (!temp.isEmpty()){
            tempInt = temp.pop();
            s.push(tempInt);
        }
        return s;
    }

    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Stack size");
        int n =  5;//sc.nextInt();

        System.out.println("Enter numbers ");
        int input;
        for (int i = 0; i < n; i++) {
            input = sc.nextInt();
            s.push(input);
        }

        s = reverseRecursive(s);
        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }// 10 20 30 40 50
}
