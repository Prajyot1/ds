package Practice_Array;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class Three_Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i] , nums[j], nums[k]));
                    j++;
                }
                else if(sum < 0) j++;
                else k--;
            }// end inner while
        }// end outer for
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));

    }
}
