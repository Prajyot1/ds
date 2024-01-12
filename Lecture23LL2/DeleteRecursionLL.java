package Lecture23LL2;

import Lecture22LL1.CreateLL;
import Lecture22LL1.NodeClass;

public class DeleteRecursionLL {
    public static NodeClass<Integer> delete(NodeClass<Integer> head, int Index){
        if (Index > 0 & head.next == null ){
            System.out.println("error");
            return head;
        }
        if(Index == 0){
            head = head.next;
            return head;
        }
        head.next = delete(head.next , Index-1);
        return head;
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = CreateLL.creatingLL();
        head = delete(head ,4);
        CreateLL.printAllElement(head);
    }
}//10 20 30 40 50 -1
