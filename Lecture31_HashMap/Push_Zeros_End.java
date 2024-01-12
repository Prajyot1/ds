package Lecture31_HashMap;

public class Push_Zeros_End {
    private static void print(int[] array){
        for (int x: array) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void pushZeros(int[] input){
        int i = 0;
        int j = 0;
        while ( j < input.length) {
            if (input[i]!=0){
                i++;
                j++;
            }else if (input[j]==0){
                j++;
            }else {
               // swap
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }       // end while
        print(input);
    }
    public static void main(String[] args) {
//        int[] array = {2 ,0 ,0 ,1 ,3 ,0 ,0};
        int[] array ={20, 15, 12, 0 ,0 ,0 ,2 ,2 ,19, 6, 17 ,16 ,20 ,0, 2, 16, 0, 10 ,0 ,14 ,15};
        pushZeros(array);
    }
}
