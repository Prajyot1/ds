package Lecture25Queues;


public class QueuesArray {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    QueuesArray(){
        data = new int[5];
        front= -1;
        rear = -1;
        size = 0;
    }

    QueuesArray(int capacity){
        data = new int[capacity];
        front= -1;
        rear = -1;
        size = 0;
    }

    public int size(){
        return size;
    }

    public void enQueue(int element) {
        if (size == data.length-1)
            System.out.println("Queue full Exception");
        else {
            if (size == 0)
                front++;
            size++;
            rear++;
            if (rear == data.length)
                rear = 0;
            data[rear] = element;
        }
    }

    public int deQueue() {
        if (isEmpty())
            System.out.println("Queue Empty Exception");

        size--;
        int temp = data[front];
        data[front] = 0;
        front++;

        if (front == data.length)
                front = 0;

        return temp;
    }
    // returs element at front of the queue
    public int front(){
        if (size == data.length)
            System.out.println("Queue Empty Exception");
        return data[front];
    }

    public boolean isEmpty(){
        return size==0;
    }
}
