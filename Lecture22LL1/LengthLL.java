package Lecture22LL1;

import java.util.Scanner;

public class LengthLL {
    public static Scanner sc = new Scanner(System.in);
    public static NodeClass<Integer> createLL(int size){
        int j = 1;
        NodeClass<Integer> temp;
        System.out.println("Enter "+ size + " elements: ");

        // first value
        int value = sc.nextInt();
        NodeClass<Integer> head = new NodeClass<>(value);
        temp = head;
        while ( j < size){
            int value1 = sc.nextInt();
            NodeClass<Integer> n = new NodeClass<>(value1);
            temp.next = n;
            temp = n;
            j++;
        }
        return head;
    }

    public static int findlength(NodeClass<Integer> head){
        NodeClass<Integer> temp = head;
        int size = 0;
        while (temp != null){
            if(temp.data == -1){
                return size;
            }
            temp = temp.next;
            size++;
        }
        return size;
    }
    public static void main(String[] args) {
        System.out.println("Enter No Of elements to enter :");
        int i = sc.nextInt();
        NodeClass<Integer> head = createLL(i);
//        NodeClassUSe.print(head);

        int ans = findlength(head);
        System.out.println("Size " + ans);
    }
}
