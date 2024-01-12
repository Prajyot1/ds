package Lecture25Queues;

public class QueueDynamicArrayUse {
    public static void main(String[] args) {
        QueueDynamicArray q = new QueueDynamicArray();
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());

        q.enQueue(10);


        q.enQueue(20);
        q.enQueue(30);
        System.out.println(q.getSize());

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.front());


        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enQueue(40);
        q.enQueue(50);
        q.enQueue(60);

        System.out.println(q.front());

    }
}
