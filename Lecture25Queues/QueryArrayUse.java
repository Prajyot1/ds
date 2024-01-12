package Lecture25Queues;

public class QueryArrayUse {
    public static void main(String[] args) {
        QueuesArray qa = new QueuesArray();
        System.out.println(qa.size());
        qa.enQueue(10);
        qa.enQueue(20);
        qa.enQueue(30);

        qa.enQueue(40);
        qa.enQueue(40);
        qa.enQueue(40);
        qa.enQueue(40);
        qa.enQueue(40);
        System.out.println(qa.size());
        System.out.println(qa.deQueue());
        System.out.println(qa.deQueue());
        qa.enQueue(10);
        qa.enQueue(20);
        System.out.println(qa.deQueue());
        System.out.println(qa.deQueue());
        System.out.println(qa.deQueue());
        System.out.println(qa.deQueue());
        System.out.println(qa.deQueue());
        System.out.println(qa.deQueue());
        System.out.println(qa.deQueue());

    }
}
