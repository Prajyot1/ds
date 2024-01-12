package Lecture25Queues;

public class QueueLlUse {
    public static void main(String[] args) throws QueryEmptyException{
//        QueueLL n = new QueueLL();
////        System.out.println(n.isEmpty());
//        n.enQueue(10);
//        n.enQueue(20);
//        n.enQueue(30);
//        System.out.println(n.front());
//
//        System.out.println(n.deQueue());
//        System.out.println(n.deQueue());
//        System.out.println(n.deQueue());
//        System.out.println(n.deQueue());
//
//        n.enQueue(40);
//        n.enQueue(50);
//        n.enQueue(60);
//
//        System.out.println(n.deQueue());
//
//        n.enQueue(70);
//        System.out.println(n.deQueue());
//        System.out.println(n.front());

        QueueLL<Integer> Q = new QueueLL<>();
        int[] arr = {10,20,30,40,50};

        for (int x: arr ) {
            Q.enQueue(x);
        }

        while (!Q.isEmpty()){
            System.out.println(Q.deQueue());
        }
    }
}
