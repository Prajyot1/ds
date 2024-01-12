package Lecture23LL2;

import Lecture22LL1.CreateLL;
import Lecture22LL1.LinkedListPracticeAll;
import Lecture22LL1.NodeClass;


public class ReverseRecursiveLL {
    public static NodeClass<Integer> reverseLL(NodeClass<Integer> prev, NodeClass<Integer> head){
        // base   -> reached the last node
        if(head.next == null){
            head.next = prev;
            return head;
        }
        NodeClass<Integer> mainHead = reverseLL(head,head.next);
        head.next = prev;
        return mainHead;
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = LinkedListPracticeAll.creatingLL();
        head = reverseLL( null , head);
        CreateLL.printAllElement(head);
    }
}
