package Lecture23LL2;

import Lecture22LL1.LinkedListPracticeAll;
import Lecture22LL1.NodeClass;

public class Merge2SortedList {
    // in this function a new node is created as answer
    public static NodeClass<Integer> merge2List(NodeClass<Integer> l1 , NodeClass<Integer> l2){
        NodeClass<Integer> ans = null;
        if (l1.data <= l2.data){
            ans = new NodeClass<>(l1.data);
            l1 = l1.next;
        }else {
            ans = new NodeClass<>(l2.data);
            l2 = l2.next;
        }
        NodeClass<Integer> temp = ans;
        while (l1  != null && l2 != null){
            System.out.println("Here");
            if (l1.data <= l2.data){
                NodeClass<Integer> node = new NodeClass<>(l1.data);
                temp.next = node;
                temp = temp.next;
                l1 = l1.next;
            } else {
                NodeClass<Integer> node = new NodeClass<>(l2.data);
                temp.next = node;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        while (l1  != null){
            System.out.println("2 loop");
            NodeClass<Integer> node = new NodeClass<>(l1.data);
            temp.next = node;
            temp = temp.next;
            l1 = l1.next;
        }
        while (l2  != null){
            System.out.println("3 loop");
            NodeClass<Integer> node = new NodeClass<>(l2.data);
            temp.next = node;
            temp = temp.next;
            l2 = l2.next;
        }
        return ans;
    }
    // in this method no new list is created
    public static NodeClass<Integer> mergeLL(NodeClass<Integer> l1 , NodeClass<Integer> l2){
        NodeClass<Integer> ans = null;
        if(l1.data <= l2.data){
            ans = l1;
            l1 = l1.next;
        }else {
            ans = l2;
            l2 = l2.next;
        }
        NodeClass<Integer> temp = ans;
        while (l1 != null && l2 != null){
            if(l1.data <= l2.data){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        while (l1  != null){
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
        }
        while (l2  != null){
            temp.next = l2;
            temp = temp.next;
            l2 = l2.next;
        }
        return ans;
    }
    public static void main(String[] args) {
        NodeClass<Integer> list1 = LinkedListPracticeAll.creatingLL();
        NodeClass<Integer> list2 = LinkedListPracticeAll.creatingLL();
        //NodeClass<Integer> ans = merge2List(list1,list2);
        NodeClass<Integer> ans = mergeLL(list1,list2);
        LinkedListPracticeAll.printingLL(ans);
    }
}
