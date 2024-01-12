package Practice_Recursion;

import java.util.Arrays;
import java.util.Scanner;

// return of al indices of array in an array
// first iteration count all taerget
// create array of size count
// while backtracting store element from back
public class AllIndicesOFArray {
    public static int[] returnindex(int[] input, int target, int index, int count){
        // base
        if (index == input.length){
            int[] smAns = new int[count];
            return smAns;
        }
        if (input[index] == target) count++;
        int[] smAns = returnindex(input,target,index+1,count);
        if (input[index] == target){
            smAns[--count] = index;
        }
        return smAns;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,2,0,20,20,50,30,40,20};
//        int[] arr = new int[10];
//        for (int i =0 ; i < 10; i++ ) {
//            arr[i] = sc.nextInt();
//        }
        int target = 20;
        System.out.println(Arrays.toString(returnindex(arr,target , 0,0)));

    }
}
