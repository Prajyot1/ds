package Lecture_18OOPS;


public class DynamicArray {
    private int[] data;
    private static int Index;

    public DynamicArray(){
        data = new int[5];
        Index = 0;
    }
    public void add(int element){
        if(Index == data.length){
            reconstruct();
        }
        data[Index] = element;
        Index++;
    }
    public void removeLast(){
        if (IsEmpty()){
            System.out.println("Noting To Remove");
            return;
        }
        int value = data[Index-1];
        data[Index-1]=0;
        Index--;
        System.out.println(value);
    }
    public int get(int index){
        if(index > this.Totalsize())
            return -1;
        return data[index];
    }
    public void set(int index , int element){
        while (!sizeLimit(index)){
            reconstruct();
        }
        if(Index==index){
            add(element);
            return;
        }
        data[index] = element;
    }
    public boolean IsEmpty(){
        return Index == 0;
    }
//    public boolean IsValid(){
//
//    }
    public int Totalsize(){
        return data.length;
    }
    public int size(){
        return DynamicArray.Index;
    }
    public boolean sizeLimit(int index){
        return index < data.length;
    }
    public void reconstruct(){
        int[] temp = data;
        int newSize = data.length * 2;
        data = new int[newSize];
        int i =0;
        for (int x : temp) {
            data[i] = x;
            i++;
        }
    }

}
