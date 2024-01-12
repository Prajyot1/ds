package Lecture25Queues;

public class QueueUsingStackUse {
    public static void main(String[] args) {
        QueueUsingStack qs = new QueueUsingStack();
        System.out.println(qs.isEmpty());
        int[] arr = {10,20,30,40,50};
        for (int x: arr) {
            qs.enQueue(x);
        }
        while (!qs.isEmpty()){
            System.out.println(qs.deQueue());
        }
    }
}
