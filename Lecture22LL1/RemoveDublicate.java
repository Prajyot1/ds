package Lecture22LL1;

import java.util.ArrayList;

//program to remove consicutive dublicate elements from arraylist
public class RemoveDublicate {

    public  static ArrayList<Integer> remove(int arr[]){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1])
                result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] array = {10,20,20,20,30,30,30,30,40,50,10};
        ArrayList <Integer> result = remove(array);
        for (int x: result) {
            System.out.println(x);
        }
    }
}
