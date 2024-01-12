package Lecture23LL2;

import Lecture22LL1.CreateLL;
import Lecture22LL1.NodeClass;
// adding / inserting elements in an list by using recursive
public class InsertRecursiveLL {
    public static NodeClass<Integer> Insert(NodeClass<Integer> head, int Index ,int element){
        NodeClass<Integer> temp = head;
        if (Index > 0 & head.next == null){
            System.out.println("Out of Bound");
            return head;}
        if (Index == 0){
            NodeClass<Integer> n = new NodeClass<Integer>(element);
            n.next = head;
            return n;
        }
        head.next = Insert(head.next , Index - 1 ,element);
        return head;
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = CreateLL.creatingLL();
        int Index = 5;
        int element = 45;
        head = Insert(head, Index ,element);
        CreateLL.printAllElement(head);
    }// 10 20 30 40 50 -1
}
