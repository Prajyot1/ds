package Lecture22LL1;

public class InsertNodeLL {
    public static NodeClass<Integer> InsertNode(NodeClass<Integer> head ,int element ,int index){
        NodeClass<Integer> temp = head;
        int i = 0;
        NodeClass<Integer> tail = null;
        if(index == 0){
            NodeClass<Integer> n = new NodeClass<>(element);
            n.next = head;
            return n;
        }
        while((i < index -1) & (temp!=null)){  // and stops from running in index out of bound~
            temp = temp.next;
            i++;
        }
//        System.out.println(i);
//        System.out.println(temp.data);
        if (temp != null){
            NodeClass<Integer> n = new NodeClass<>(element);
            n.next = temp.next;
            temp.next = n;
            }
        return head;
        }
    public static void main(String[] args) {
        NodeClass<Integer> head = CreateLL.creatingLL();
        head = InsertNode(head,20,0);
        CreateLL.printAllElement(head);
    }
}
