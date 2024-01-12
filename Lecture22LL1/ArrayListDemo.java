package Lecture22LL1;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(30);
        arr.size();
        System.out.println(arr.get(0));
        arr.add(0,10);
        System.out.println(arr.get(0));
        arr.set(1,100);
        arr.add(1,200);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
