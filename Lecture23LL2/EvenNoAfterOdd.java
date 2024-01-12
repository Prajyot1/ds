package Lecture23LL2;

import Lecture22LL1.LinkedListPracticeAll;
import Lecture22LL1.NodeClass;

// convert the given input to make all even element after odd
public class EvenNoAfterOdd {
    public static NodeClass<Integer> shiftEvenAfterOdd(NodeClass<Integer> head){
        //while traversing input list
        // make 2 list one even one odd
        // add even list after odd;
        NodeClass<Integer> temp = head;
        NodeClass<Integer> odd = new NodeClass<>(0);
        NodeClass<Integer> even = new NodeClass<>(0);
        NodeClass<Integer> oddTemp = odd;
        NodeClass<Integer> evenTemp = even;

        while (temp != null){
            if(temp.data % 2 == 0){
                evenTemp.next = temp;
                evenTemp = evenTemp.next;
            }else{
                oddTemp.next = temp;
                oddTemp = oddTemp.next;
            }
            temp = temp.next;
        }

        oddTemp.next = even.next;
        return odd.next;
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = LinkedListPracticeAll.creatingLL();
        NodeClass<Integer>  ans = shiftEvenAfterOdd(head);
        LinkedListPracticeAll.printingLL(ans);
    }
}
