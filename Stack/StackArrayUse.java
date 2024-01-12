package Stack;

public class StackArrayUse {
    public static void main(String[] args) throws StackEmptyException , StackFullException{
        StackArray stack = new StackArray();
        System.out.println(stack.size());

        StackArray stack1 = new StackArray(10);
        stack1.push(10);
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.pop());
        int i = 20;
        while (i < 100){
            stack1.push(i);
            i+=10;
        }
        System.out.println("Size :"+stack1.size());
        for (int j = 0; j < 8; j++) {
            System.out.println(stack1.pop());
        }
        System.out.println("Size :" +stack1.size());
        stack1.push(100);

        System.out.println(stack1.getTop());
//        System.out.println("Size :"+stack.size());
//        System.out.println("Size :"+ stack.size());
//        stack.getTop();
    }
}
