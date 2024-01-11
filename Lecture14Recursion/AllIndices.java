package Lecture14Recursion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllIndices {
    private static int[] FindIndices(int[] array , int find , int startIndex){
        if (startIndex==array.length){
                int[] output = new int[0];
                return output;
        }
        int smalloutput[] = FindIndices(array,find,startIndex+1);
            if(array[startIndex]==find){
                int[] output = new int[smalloutput.length+1];
                output[0]=startIndex;
                for (int i = 0; i < smalloutput.length; i++) {
                    output[i+1]= smalloutput[i];
                }
                return output;
            }
            else{
                return smalloutput;
            }
        }
    public static int[] FindIndices(int[] array , int find){
        return FindIndices(array,find,0);
    }
    private static ArrayList<Integer> allIndicesNewHelper(int[] input , int target,int index, ArrayList list){
        if(index == input.length) return list;
        if(input[index] == target) list.add(index);
        return allIndicesNewHelper(input,target,index+1,list);
    }

    public static ArrayList<Integer> allIndicesNew(int[] input , int target){
        ArrayList<Integer> list = new ArrayList<>();
        return allIndicesNewHelper(input,target,0,list);
    }
    // without passing arraylist as argument and without creating arraylist in each function call
    // created a List in last function call and retuned
    // whener target == index element insert index in list retured from previous recursion
    // else return that list as it is
    public static ArrayList<Integer> allIndicesNew2(int[] input , int target, int index){
        if (index == input.length) return new ArrayList<>();
        ArrayList<Integer> smAns = allIndicesNew2(input,target,index+1);
        if(input[index] == target) smAns.add(0,index);
        return smAns;
    }

        public static void main(String[] args) {
       int[] array = {9,8,10,8,8};
       int target = 8;
//       int[] ans = FindIndices(array,target);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(ans[i]);
//       }
        ArrayList<Integer> listAns = allIndicesNew2(array,target , 0);
        System.out.println(listAns);
    }
}
