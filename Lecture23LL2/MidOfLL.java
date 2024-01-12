package Lecture23LL2;


import Lecture22LL1.LinkedListPracticeAll;
import Lecture22LL1.NodeClass;

public class MidOfLL {
    /*
    *   1 approch will be to calculate the length and than divide by 2 traverse to that value and return iy
    * 2  apprpach -> two pointer fast and slow
    * slow will move 1 step at time and fast will move 2 steps at time
    * when fast reaches end         slow will have reached   mid
    * */
    public static int findMid(NodeClass<Integer> head){
        NodeClass<Integer> fast = head;
        NodeClass<Integer>  slow = head;  // or move fast one point ahead
        while (fast != null && fast.next != null && fast.next.next != null){
            System.out.println("running");
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = LinkedListPracticeAll.creatingLL();
        System.out.println(findMid(head));
    }
}
