package Stack;


public class StackArray {
        private int data[];
        private int top;
        public StackArray(){
            top = -1;
            data = new int[10];
        }
        public StackArray(int size){
            top = -1;
            data = new int[size];
        }
        public boolean isEmpty(){
            return top==-1;
        }
        public int size(){
            return top + 1;
        }
        public int getTop() throws StackEmptyException{
            if (this.size() == 0){
                StackEmptyException e = new StackEmptyException();
                throw e;
            }
            else
                return data[top];
        }
        public void push(int element) throws StackFullException{
            if (size() == data.length){
//                StackFullException e = new StackFullException();
//                throw e;
                // else
                throw new StackFullException();
            }
            else {
//                top++;
//                data[top] = element;
                data[++top] = element;
            }
        }
        public int pop() throws StackEmptyException{
            if ( isEmpty()){
                throw new StackEmptyException();
            }
            else {
              int temp =  data[top];
              top--;
              return temp;
            }
        }
    }

