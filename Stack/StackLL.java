package Stack;

import Lecture22LL1.NodeClass;

public class StackLL {
    private NodeClass<Integer> last = null;
    private NodeClass<Integer> head = null;
    private int size = -1;

    public StackLL(int size){
        this.size = size;
    }
    public StackLL(){
        size = 5;
    }
    public boolean isEmpty() {
//        last == null ? return true : return false;
        if (last == null){
            return true;
        }
        else
            return false;
    }
    public int size() {
            return this.size;
    }
    public int elementsInStack(){
        if (isEmpty()){
            return 0;
        }
        else {
        NodeClass<Integer> temp = head;
        int count = 0;
            while (temp != null){
                temp = temp.next;
                count++;
                }
            return count;
        }
    }
    public void push(int elem) throws  StackFullException{
        if ( elementsInStack() > size-1){
            throw new StackFullException();
        }else {
            NodeClass<Integer> n = new NodeClass<>(elem);

            if (last == null){
                last = n;
                head = n;
            } else{
                last.next = n;
                last = last.next;
            }
        }
    }
    public int pop() throws StackEmptyException{
        if (isEmpty()){
            throw new StackEmptyException();
        }
        else{
            NodeClass<Integer> temp = head;
//            To be done




//            while (temp != null){
//            }
            return last.data;
        }
    }

    // to be check
    public int gettop() throws StackEmptyException{
        if (!isEmpty())
            return last.data;
        else
            throw new StackEmptyException();
    }
}
