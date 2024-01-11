package Lecture_11;

import java.util.Arrays;

public class FindUniqueelement {
    public static void findUnique(int[] array) {
        // brute force
        for (int i = 0; i < array.length; i++) {
            int unique = 0;
            if (array[i] != -1) {
                for (int j = i+1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        array[j] = -1;
                        unique = 0;
                        break;
                    }
                    else
                        unique = array[i];
                }
            }
            if (unique!=0)
                System.out.println(unique);
        }
    }
    // method 2
    public static void findUnique1(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=-1 & ((i+1) < array.length)){
                if (array[i]==array[i+1]){
                array[i+1]=-1;
                }
                else {
                System.out.println(array[i]);
                }
            }
            else if (i == array.length-1){
                System.out.println(array[i]);
            }
        }
    }
        public static int findUnique2(int[] array){
        int XOR = 0;
        for (int i = 0; i < array.length ; i++) {
                XOR ^= array[i];
            }
        return XOR;
        }
        public static void main(String[] args) {
        //int[] array = {2,3,1,6,3,6,2};
        //int[] array = {2,4,7,2,7};
        int[] array = {1,3,1,3,6,6,7,10,7};
        //findUnique(array);
        //findUnique1(array);
            System.out.println( findUnique2(array));
        }
}
