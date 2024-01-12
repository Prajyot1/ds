package Lecture25Queues;

import Lecture22LL1.NodeClass;

public class QueueLL <T>{
    private NodeClass<T> front;
    private NodeClass<T> rear;
    int size;
    public QueueLL(){
        front = null;
        rear = null;
        size=0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void enQueue(T element){
        NodeClass<T> n = new NodeClass<>(element);
        if (isEmpty()) {
            front = n;
            rear = n;
        }else {
            rear.next = n;
            rear = n;
        }
        size++;
    }
    public T deQueue() throws QueryEmptyException{
        if (isEmpty()) {
            throw new QueryEmptyException();
        }
        T temp = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        size--;
        return temp;
    }

    public T front() throws QueryEmptyException{
        if (isEmpty())
            throw new QueryEmptyException();
        return front.data;
    }

    public int getSize(){
        return size;
    }
}

