package Lecture22LL1;

public class swapINll {
    public static NodeClass<Integer> swapLL(NodeClass<Integer> head , int ind1 , int ind2){
        NodeClass<Integer> temp = head;
        NodeClass<Integer> curr1 = null;
        NodeClass<Integer> curr2 = null;
        NodeClass<Integer> prevInd1 = head;
        NodeClass<Integer> prevInd2 = head;

        if (ind1 == 0 || ind2 == 0){
            System.out.println("block 1");
            int count = 1;
            if (ind1 > ind2){
                while (count < ind1){
                    prevInd2 = prevInd2.next;
                    count++;
                }
                curr2 = prevInd2.next;
            } else if (ind2 > ind1) {
                while (count < ind2){
                    prevInd2 = prevInd2.next;
                    count++;
                }
                curr2 = prevInd2.next;
            }
            head = curr2;
            prevInd2.next = temp;
            temp.next = head.next;


            System.out.println(head.data);
            System.out.println(head.next.data);
            System.out.println(head.next.next.data);
            System.out.println(head.next.next.next.data);
            System.out.println(head.next.next.next.next.data);
            System.out.println(head.next.next.next.next.next.data);

        }else {
            int count = 1;
            while (count < ind1) {
                prevInd1 = prevInd1.next;
                count++;
            }
            curr1 = prevInd1.next;
            count = 1;

            while (count < ind2) {
                prevInd2 = prevInd2.next;
                count++;
            }
            curr2 = prevInd2.next;

            // swapping
            prevInd1.next = curr2;
            prevInd2.next = curr1;
            curr1.next = curr2.next;
            curr2.next = prevInd2;
        }
        return head;
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = CreateLL.creatingLL();
        int index1 = 0;
        int index2 = 3;
        head = swapLL(head,index1,index2);  
//        CreateLL.printAllElement(head);
    }
}// 1 2 3 4 5 -1
