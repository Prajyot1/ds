package Lecture22LL1;
// program to only print elements in reverse order
public class ReverseLL {
    public static int findLength2(NodeClass<Integer> head){
        int size = 0;
        NodeClass<Integer> temp = head;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public static void reverseLLPrint(NodeClass<Integer> head){
        int count = findLength2(head);
        NodeClass<Integer> curr;

        int i = 0;
        while (count > 0){
            i = count;
            curr = head;
            while (i > 1){
                curr = curr.next;
                i--;
            }
            System.out.print(curr.data+" ");
            count--;
        }
    }
    public static void reverseLLPrintRecursive(NodeClass<Integer> head){
        NodeClass<Integer> curr = head;
        if(curr.next == null){
            System.out.print(curr.data+" ");
            return;
        }
        else{
            reverseLLPrintRecursive(curr.next);
            System.out.print(curr.data +" ");
        }

    }
    public static void main(String[] args) {
        NodeClass<Integer> head = CreateLL.creatingLL();

//       reverseLLPrint(head);
        reverseLLPrintRecursive(head);
//        CreateLL.printAllElement(head);
    }
}
