package Lecture25Queues;

import Lecture_18OOPS.DynamicArray;

public class QueueDynamicArray {
    private DynamicArray data;
    private int front;
    private int rear;
    private  int size;

    public QueueDynamicArray(){
        data = new DynamicArray();
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
    public void enQueue(int element){
        if (isEmpty())
            front++;
        size++;
        rear++;
        data.add(element);
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        int temp = data.get(front);
        front++;
        size--;
        return temp;

    }
    public int front(){
        if (isEmpty())
            return -1;
        else
            return data.get(front);
    }
}
