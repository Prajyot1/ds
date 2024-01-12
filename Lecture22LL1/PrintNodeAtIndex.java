package Lecture22LL1;

import java.util.Scanner;

public class PrintNodeAtIndex {
    public static int findAtI(NodeClass <Integer> tempHead ,int index){
        NodeClass<Integer> temp = tempHead;
        int i = 0;
        while (i != index){
            temp = temp.next;
            i++;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of list :");
        int size = sc.nextInt();
        NodeClass<Integer> head = LengthLL.createLL(size);
        System.out.println("Enter index :");
        int index  = sc.nextInt();
        int ans = -1;
        if (index <= size)
            ans = findAtI(head , index);
        System.out.println("Element at Index "+index+" is : "+ ans );
    }
}
