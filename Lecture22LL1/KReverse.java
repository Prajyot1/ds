package Lecture22LL1;

public class KReverse {
    public static NodeClass<Integer> reverseK(NodeClass<Integer> head , int num){
        NodeClass<Integer> curr = head;
        int tot = 0;
        int count = 1;

        while(count < num){
            if (count == num){
                head = curr;
            }
            curr = curr.next;
            count++;
//            reverseK(head,)
        }

        return head;
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = CreateLL.creatingLL();
        int round = 3;
        head = reverseK(head,round);
    }
}
