package Practice_Recursion.Kunak_Kushwha;

public class Find_MAX_MIN {
    public static int[] find(int[] input){
        int[] ans = new int[2];
        ans[0] = Integer.MAX_VALUE;
        ans[1] = Integer.MIN_VALUE;
    return findHelp(input, 0, ans);
    }
    private static int[] findHelp(int[] input , int index , int[] ans){
        // base
        if (index == input.length) return ans;

        // recursive call
        ans = findHelp(input,index+1,ans);
        if (input[index] < ans[0])  ans[0] = input[index];
        if (input[index] > ans[1])  ans[1] = input[index];
        return ans;
    }
    public static int findMinRec(int[] input , int index) {
        // base
        if (index == input.length ) return Integer.MAX_VALUE;
        // recursive call and calculation
        return Math.min(input[index] , findMinRec(input,index+1));
    }
    public static int findMaxRec(int[] input , int index) {
        // base
        if (index == input.length ) return Integer.MIN_VALUE;
        // recursive call and calculation
        return Math.max(input[index] , findMaxRec(input,index+1));
    }
    public static void main(String[] args) {
//        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int[] arr = {1, 4, 45, 6, 10, -8};
//        int[] ans = find(arr);
//        System.out.println("MIN :"+ ans[0]);
//        System.out.println("MAX :"+ ans[1]);
        System.out.println("Min :" + findMinRec(arr, 0));
        System.out.println("Max :" + findMaxRec(arr, 0));

    }
}
