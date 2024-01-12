package Lecture22LL1;

import java.util.Scanner;

public class CreateLL {
    public static Scanner sc = new Scanner(System.in);
    public static NodeClass<Integer> creatingLL(){
        NodeClass<Integer> head = null;
        System.out.println("Enter values ");

        int Tvalue = sc.nextInt();
        head = new NodeClass<>(Tvalue);

        NodeClass<Integer> temp = head;
        Tvalue = sc.nextInt();

        while(Tvalue != -1){
            NodeClass<Integer> n = new NodeClass<>(Tvalue);
            Tvalue = sc.nextInt();
            temp.next = n;
            temp = temp.next;
            }

        return head;
    }
    public static void printAllElement(NodeClass<Integer> head){
        NodeClass<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = creatingLL();
        printAllElement(head);
    }
}
