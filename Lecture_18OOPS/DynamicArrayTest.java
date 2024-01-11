package Lecture_18OOPS;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        System.out.println(da.IsEmpty());
//        for(int i=0 ; i < 100 ; i++){
//            da.add(i);
//        }
        //System.out.println(da.size());

//        da.set(4,10);
//        System.out.println(da.get(3));
//        System.out.println(da.get(4));

//        while (!da.IsEmpty()){
//            da.removeLast();
//            System.out.println("size :" + da.size());
//        }
        da.add(10);
        da.add(20);
        da.set(10,50);
        System.out.println(da.get(10));
        System.out.println(da.size());
        da.set(100,99);
        System.out.println(da.get(100));

    }
}
