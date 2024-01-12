package Lecture23LL2;

import Lecture22LL1.LinkedListPracticeAll;
import Lecture22LL1.NodeClass;

public class FindNodeLL_Recursively {
    public static int findNode_Recursively(NodeClass<Integer> head , int find){
        // base
        if(head == null) return -1;
        if(head.data == find) return 0;
        int smAns = findNode_Recursively(head.next , find);
        if (smAns == -1) return -1;
        return 1 + smAns;
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = LinkedListPracticeAll.creatingLL();
        int find = -34;
        int index = findNode_Recursively(head, find);
        System.out.println(" Found At Index "+ index);
    }
}
