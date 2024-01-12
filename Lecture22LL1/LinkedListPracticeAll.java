package Lecture22LL1;

import java.util.Scanner;

public class LinkedListPracticeAll {
    public static Scanner sc = new Scanner(System.in);
    public static NodeClass<Integer> deleteInLinkedL(NodeClass<Integer> head , int idx){
        if (head == null) return null;
        // deleting head
        if(idx == 0){
            return  head.next;
        }
        // deleting other
        // -> goint to prev of index
        NodeClass<Integer> prev = head;
        int count = 0;
        while(prev != null && count < (idx - 1)){
            prev = prev.next;
            count++;
        }
         // exception check
        if(prev == null || prev.next == null){
            System.out.println("Out of bound exception , please enter valid index ");
            return head;
        }
        prev.next = prev.next.next;
        // check of last element reached

    return head;
    }
    public static NodeClass<Integer> insertInLinkedL(NodeClass<Integer> head , int elem , int idx){
        NodeClass<Integer> nodeToInsert = new NodeClass<>(elem);
        // inserting as head
        if(idx == 0){
            nodeToInsert.next = head;
            return nodeToInsert;
        }
        // insertiog as not head
        // -> goint up till prev of idx
        int count = 0;
        NodeClass<Integer> prev = head;
        while (count < idx - 1 && prev != null){ // we need to go 1 index less for prev
            // prev pointer
            prev = prev.next;
            count++;
        }
        // exception index out of bound
        if(prev == null){
            System.out.print("Index out of bound , Cant Insert ");
            return head;
        }
        // next pointer points towards the next of index
        NodeClass<Integer> next = prev.next;
        nodeToInsert.next = next;
        prev.next = nodeToInsert;
        return head;
    }
    public static void printingLL(NodeClass<Integer> head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static NodeClass<Integer> creatingLL(){
        System.out.println("Enter element in Linked List :");
        NodeClass<Integer> head = null;
        NodeClass<Integer> temp = null;
        int value = sc.nextInt();
        //boolean headFlag = true;

        while (value != -1){
//            if(headFlag){
//                head = new NodeClass<>(value);
//                temp = head;
//                System.out.println("Enter Next Element :");
//                value = sc.nextInt();
//                continue;
//            }
            NodeClass<Integer> node = new NodeClass<>(value);
            if(head == null) {
                head = node;
                //headFlag = false;
                temp = head;
            }else {
                temp.next = node;
                temp = temp.next;
            }
            System.out.println("Enter Next Element :");
            value = sc.nextInt();
        }
        return head;
    }
    // this function increases value in each node of LinkedList by 1
    public static void incrementEachValue(NodeClass<Integer> head){
        while (head != null){
            head.data++;
            head = head.next;
        }
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = creatingLL();
        NodeClass<Integer> Nhead = deleteInLinkedL(head,6);
        //NodeClass<Integer> Newhead = insertInLinkedL(head,100,6);
        //incrementEachValue(head);
        printingLL(Nhead);
        // 10 20 30 40 50 -1
    }
}
