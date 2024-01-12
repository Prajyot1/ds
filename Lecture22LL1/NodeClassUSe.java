package Lecture22LL1;
public class NodeClassUSe {

    public static NodeClass<Integer> createNodes(){
        NodeClass<Integer> n1 = new NodeClass<>(50);
//        NodeClass<Integer> n2 = new NodeClass<>(150);
//        NodeClass<Integer> n3 = new NodeClass<>(250);
//        NodeClass<Integer> n4 = new NodeClass<>(350);

//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
        return n1;
    }

    public static void print(NodeClass<Integer> head){
        NodeClass<Integer> node = head;
        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
    // all methods of linked list
    public static void main(String[] args) {
//        NodeClass n1 = new NodeClass(10);
//        System.out.println(n1.data);
//        System.out.println(n1.next);
        NodeClass<Integer> head = createNodes();
        print(head);
    }


}
