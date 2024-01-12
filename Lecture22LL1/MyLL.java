package Lecture22LL1;

import java.util.Scanner;

public class MyLL <T>{
    int size;
    public static Scanner sc = new Scanner(System.in);
    public MyLL(){
        NodeClass<T> node;
        size = 0;
    }
    public NodeClass<Integer> createLL(){
        System.out.println("Enter Element ");
        int data = sc.nextInt();
        NodeClass<Integer> head = null;

        while (data != -1){
            if (size == 0){
                NodeClass<Integer> node = new NodeClass<>(data);
                head = node;
            }

        }
        return head;
    }
    public int length(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

}
