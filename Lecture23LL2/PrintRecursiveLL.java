package Lecture23LL2;

import Lecture22LL1.CreateLL;
import Lecture22LL1.NodeClass;

public class PrintRecursiveLL {
    public static void printRecursiveReverse(NodeClass<Integer> head){
        if(head == null){
            return;
        }
        printRecursiveReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void printRecursive(NodeClass<Integer> head){
        if (head == null) {
            return;
        }
        System.out.print(head.data+" ");
        printRecursive(head.next);
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = CreateLL.creatingLL();
        printRecursive(head);
        System.out.println();
        printRecursiveReverse(head);
        // 10 20 30 40 50 60 -1
    }
}
