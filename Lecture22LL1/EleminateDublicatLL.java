package Lecture22LL1;

public class EleminateDublicatLL {
    public static NodeClass<Integer> RemoveDub(NodeClass<Integer> head){
        NodeClass<Integer> curr = head;
        int preValue = curr.data;

        NodeClass<Integer> prevcurr = curr;
        curr = curr.next;

        while (curr != null) {
            if (preValue == curr.data) {
                prevcurr.next = curr.next;
                curr = curr.next;
            } else {
                preValue = curr.data;
                curr = curr.next;
                prevcurr = prevcurr.next;
            }
        }
        return head;
    }
    public static NodeClass<Integer> RemoveDub2(NodeClass<Integer> head){
        if(head == null){
            return head;
        }
        NodeClass<Integer> curr = head;
        while (curr.next != null){
            if (curr.data.equals(curr.next.data)){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = CreateLL.creatingLL();
//        head = RemoveDub(head);
        head = RemoveDub2(head);
        CreateLL.printAllElement(head);
    }
}
