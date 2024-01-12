package Lecture25Queues;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> st1;
    private Stack<Integer> st2;
    private int size;
    public QueueUsingStack(){
        st1 = new Stack<>();
        st2 = new Stack<>();
        size = -1;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void enQueue(int element){
        st1.push(element);
        size++;
    }
    public int deQueue(){
        if (isEmpty()){
            System.out.println("empty Error");
            return -1;
        }
        while (!st1.isEmpty()){
            int temp = st1.pop();
            st2.push(temp);
        }
        int ans = st2.pop();
        while (!st2.isEmpty()){
            int temp = st2.pop();
            st1.push(temp);
        }
        return ans;
    }
}
