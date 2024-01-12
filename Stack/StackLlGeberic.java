package Stack;

import Lecture22LL1.NodeClass;

public class StackLlGeberic<T> {
    private NodeClass<T> head;
    private int Tsize;
    private int size;
    StackLlGeberic(){
        head=null;
        Tsize=5;
        size=0;
    }
    StackLlGeberic(int SizeL){
        head=null;
        Tsize = SizeL;
        size=0;
    }

    public void push(T element) throws StackFullException{
        NodeClass<T> n = new NodeClass<>(element);
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
    public T pop() throws StackEmptyException{
        if (isEmpty()){
            throw new StackEmptyException();
        }
        else {
            size--;
            T temp =  head.data;
            head = head.next;
            return temp;
        }
    }

    public T top() throws StackEmptyException{
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
