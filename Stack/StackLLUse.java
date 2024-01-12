package Stack;

public class StackLLUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        StackLL sl = new StackLL();
        StackLL sl1 = new StackLL(10);
//        System.out.println("Size :" + sl.size());
//        System.out.println("Size :" + sl1.size());
//
//        System.out.println(sl.isEmpty());
//        System.out.println(sl1.isEmpty());

        sl.push(10);
        sl.push(20);
        sl.push(20);
        sl.push(30);
        sl.push(240);

        System.out.println(sl.elementsInStack());
        System.out.println(sl.pop());
        System.out.println(sl.elementsInStack());
        System.out.println(sl.pop());
        System.out.println(sl.elementsInStack());
        System.out.println(sl.pop());
        System.out.println(sl.elementsInStack());
        System.out.println(sl.pop());
        System.out.println(sl.elementsInStack());


        //        System.out.println(sl.isEmpty());

        //        System.out.println(sl.isEmpty());
//        System.out.println(sl1.isEmpty());

    }
}
