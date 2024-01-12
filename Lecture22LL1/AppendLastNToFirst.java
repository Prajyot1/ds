package Lecture22LL1;


public class AppendLastNToFirst {
    public static NodeClass<Integer> moveNode(NodeClass<Integer> head , int LastLength){
        NodeClass<Integer> curr = head;
        NodeClass<Integer> newHead;
        NodeClass<Integer> tempCurr;

        int ans = LengthLL.findlength(head);  // get length of linked list
        int firstNode = 0;  // the first nodes which need to be moved
        if (ans > LastLength)
            firstNode = ans - LastLength;

        int count = 1;
        while (count < firstNode){
            curr = curr.next;
            count++;
        }
        newHead = curr.next;  // making the address of breaked part as head
        tempCurr = curr.next;
        curr.next = null;  // making element before breaking part as null

        while (tempCurr.next != null){
            tempCurr = tempCurr.next;
//            System.out.println(tempCurr.data);
        }
        tempCurr.next = head;
        return newHead;
    }
    public static int findLengthLL(NodeClass<Integer> head){
        int ans = 0;
        while (head != null){
            head = head.next;
            ans++;
        }
        return ans;
    }
    public static NodeClass<Integer> shiftNode(NodeClass<Integer> head , int num){
        NodeClass<Integer> temp = head;
        NodeClass<Integer> nHead = null;
        NodeClass<Integer> tail = null;
        // find length
        int length = findLengthLL(head);

        int tailIndex = 0;
        if(length > num) tailIndex = length - num;
        else return head;  // out of bound exception
        // this node will become the last node all node next to tail be moved to head
        int count = 1;
        while (count < tailIndex){
            temp = temp.next;
            count++;
        }
        nHead = temp.next;
        tail = temp.next;
        temp.next = null;

        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = head; // original head
        return nHead;
    }
    public static void main(String[] args) {
        // old practice
        //NodeClass<Integer> head = CreateLL.creatingLL();
        //int Lastlength = 5;  // move last 4 to the head
        //head = moveNode(head , Lastlength);
        //CreateLL.printAllElement(head);

        // new try
        NodeClass<Integer> head = LinkedListPracticeAll.creatingLL();
        // shifting n node to the first
        int num = 4; // shift last 2 node to first
        NodeClass<Integer> ansHead = shiftNode(head,num);
        LinkedListPracticeAll.printingLL(ansHead);
    }
}
