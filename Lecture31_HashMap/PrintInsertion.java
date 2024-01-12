package Lecture31_HashMap;

import java.util.HashMap;

public class PrintInsertion {
    public static void findInsertion(int[] inp1 , int[] inp2){
        // brute force
        int n1 = inp1.length; ;
        int n2 = inp2.length;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (inp1[i]== inp2[j]){
                    System.out.print(inp1[i]+" ");
                    break;
                }
            }
        }
    }
    public static void findInsertion1(int[] inp1 , int[] inp2){
        HashMap<Integer, Boolean> map = new HashMap<>();
        int n1,n2;
        int[] array1;
        int[] array2;
        if (inp1.length < inp2.length){
            n1 = inp1.length;
            n2 = inp2.length;
            array1 = inp1;
            array2 = inp2;

        }else {
            n1 = inp2.length;
            n2 = inp1.length;
            array1 = inp2;
            array2 = inp1;
        }
        for (int i = 0; i < n1; i++) {
            map.put(array1[i],true);
        }
        for (int i = 0; i < n2; i++) {
            if (map.containsKey(array2[i])){
                System.out.print(array2[i]+" ");
            }
        }

    }
    public static void main(String[] args) {
        int[] arr1 = {2 ,6 ,8 ,5 ,4 ,3};
        int[] arr2 = {2 ,3 ,4 ,7};
//        int[] arr1 = { ,2, 3 ,4, 2};
//        int[] arr2 = {2, 6, 1, 2};
        findInsertion1(arr1,arr2);
    }
}
