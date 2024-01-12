package Lecture17Recurson3;

import java.util.ArrayList;

public class SubSetOFArray {
    public static  ArrayList<String> findSubset(int[] input , int index ,String smAns ){
        // base
        if (index >= (input.length)){
            ArrayList<String> sm = new ArrayList<>();
            sm.add(smAns);
            return sm;
        }
        ArrayList<String> sm ;
        ArrayList<String> sm2;


        sm = findSubset(input,index+1,smAns);
        smAns = smAns + input[index];
        sm2 = findSubset(input,index+1,smAns);
        sm.addAll(sm2);
        return sm;
    }
    // return in matrix form

    public static void main(String[] args) {
        int[] input = {15,20,30};
        ArrayList<String> ans;
        ans = findSubset(input,0, "");
        System.out.println(ans);
    }
}
