package Lecture_11;

import java.util.Arrays;

public class FindDublicate {
    // brute
    public static void dublicateElement(int[] array){
        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length ; j++) {
                if (array[i]!=-1){
                    if(array[i]==array[j]){
                        array[j]=-1;
                        System.out.print(array[i]);
                  }
                }
            }
        }
    }
    // method 2
    public static void dublicateElement2(int[] array) {
        Arrays.sort(array);
        //boolean got = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println(array[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        //int[] array = {0 ,7 ,2 ,5 ,4 ,7 ,1 ,3 ,6};
        //int[] array = {0 ,2 ,1 ,3 ,1};
        int[] array = {0 ,3 ,1 ,5 ,4 ,3 ,2};
        //dublicateElement(array);
        dublicateElement2(array);

    }
}
