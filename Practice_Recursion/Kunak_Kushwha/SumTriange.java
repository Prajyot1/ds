package Practice_Recursion.Kunak_Kushwha;

import java.util.Arrays;

/*
Input : A = {1, 2, 3, 4, 5}
        Output : [48]
        [20, 28]
        [8, 12, 16]
        [3, 5, 7, 9]
        [1, 2, 3, 4, 5]

        Explanation :
        Here,   [48]
        [20, 28] -->(20 + 28 = 48)
        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)
*/
public class SumTriange {
    public static void sumTriangle(int[] input){
        // base
        if (input.length == 1) return;
        // cal
        int[] smInput = new int[input.length-1];
        for (int i = 0; i < smInput.length; i++) {
            smInput[i] = input[i] + input[i+1];
        }
        // recursive call
        sumTriangle(smInput);
        // print
        System.out.println(Arrays.toString(smInput));
    }
    public static void main(String[] args) {
        int[] A= {1,2,3,4,5};
        sumTriangle(A);
    }
}
