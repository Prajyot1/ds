package Lecture31_HashMap;

import java.util.HashMap;
import java.util.Set;

public class MaxFrequencyNum {
    public static void printMap(HashMap<Integer, Integer> map){
        Set<Integer> ans = map.keySet();
        for (int x:ans) {
            System.out.print(x +" : " + map.get(x) + " ");
        }
    }
    public static int findMaxFre(int[] arr){

        // brute force
        int ans=0;
        int n = arr.length;
        int count;
        int MaxCount = -999;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > MaxCount){
                MaxCount = count;
                ans = arr[i];
            }
        }
        return ans;

    }
    public static int findMaxFre1(int[] arr){
        // using hashmap
        HashMap<Integer , Integer> map = new HashMap<>();
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            if (map.containsKey(temp)){
                int value = map.get(arr[i]);
                map.put(temp,value+1);
            }else {
                map.put(temp,1);
            }
        }
//        printMap(map);
        int maxFreKey = -1;
        int maxCount = -1;
//        Set<Integer> some = map.keySet();
//
//        for (int x:some) {
//            if (maxCount < map.get(x)){
//                maxCount = map.get(x);
//                maxFreKey = x;
//            }
//        }
        // using for loop
        for (int i = 0; i < n; i++) {
            if (maxCount < map.get(arr[i])){
                maxCount = map.get(arr[i]);
                maxFreKey = arr[i];
            }
        }
    return maxFreKey;
    }

    public static void main(String[] args) {
        int[] arr = {2 ,12, 2, 11, 12, 2 ,1 ,2 ,2 ,11 ,12, 2 ,6};
//        int[] arr = {1, 4, 5};
        int ans = findMaxFre1(arr);
        System.out.println("max frequency elemtn in array is " + ans);
    }
}
