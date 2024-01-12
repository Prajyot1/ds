package Stack;

import Lecture22LL1.NodeClass;

public class StackLLNew {
    private NodeClass<Integer> head;
    private int Tsize;
    private int size;
    StackLLNew(){
        head=null;
        Tsize=5;
        size=0;
    }
    StackLLNew(int SizeL){
        head=null;
        Tsize = SizeL;
        size=0;
    }

    public void push(int element) throws StackFullException{
        NodeClass<Integer> n = new NodeClass<>(element);
        if (getSize() == Tsize){
            throw new StackFullException();
        }else {
//            if (isEmpty()) {
//                head = n;
//                size++;
//            }
//            else {
                n.next = head;
                head = n;
                size++;
            }
    }
    public int pop() throws StackEmptyException{
        if (isEmpty()){
            throw new StackEmptyException();
        }
        else {
            size--;
            int temp =  head.data;
            head = head.next;
            return temp;
        }
    }

    public int top() throws StackEmptyException{
        if (isEmpty()){
            throw new StackEmptyException();
        }else {
            return head.data;
        }
    }

    public boolean isEmpty(){
        return size == 0 ;
    }
    public int getSize(){
        return size;
    }
    public int getTsize(){
        return Tsize;
    }
}
