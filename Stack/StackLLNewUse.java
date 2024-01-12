package Stack;

public class StackLLNewUse {
    public static void main(String[] args) throws StackEmptyException, StackFullException{
//        StackLLNew sn = new StackLLNew();
//        sn.pop();
//        sn.top();
////        System.out.println(sn.isEmpty());
//        sn.push(10);
//        sn.push(20);
//        sn.push(30);
//        sn.push(40);
//        sn.push(50);
//    int i =0;
//        while (i < 5) {
//            System.out.print(sn.top()+" ");
//            System.out.print(sn.pop()+" ");
//            System.out.println();
//            i++;
//        }
//        StackLLNew sn1 = new StackLLNew(2);
//        System.out.println(sn1.getSize());
//        sn1.push(100);
//        System.out.println(sn1.getSize());
//        System.out.println(sn1.getTsize());
//

        StackLlGeberic<Integer> snG = new StackLlGeberic<>();
        System.out.println(snG.isEmpty());
        snG.push(10);
        snG.push(20);
        snG.push(30);
        snG.push(40);
        snG.push(50);
        int i =0;
        while (i < 5) {
            System.out.print(snG.top()+" ");
            System.out.print(snG.pop()+" ");
            System.out.println();
            i++;
        }
        StackLLNew sn1 = new StackLLNew(2);
        System.out.println(sn1.getSize());
        sn1.push(100);
        System.out.println(sn1.getSize());
        System.out.println(sn1.getTsize());


    }
}
