package Lecture22LL1;

public class DeleteInLL {
    public static NodeClass<Integer> deleteNode(NodeClass<Integer> head ,int index ){
        NodeClass<Integer> tempH = head;
        int count = 0;
        if(index == 0){
            tempH = tempH.next;
            return tempH;
        }
        while ((count < index-1) & (tempH.next != null)){
            tempH = tempH.next;
            count++;
        }
        if(tempH.next == null)
            return head;
        tempH.next = tempH.next.next;
        return head;
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = CreateLL.creatingLL();
        head = deleteNode(head,30);
        CreateLL.printAllElement(head);
    }
}
