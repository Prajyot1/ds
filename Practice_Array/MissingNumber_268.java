package Practice_Array;

public class MissingNumber_268 {
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] == 0) i++;
            int elem = nums[i];
            if(nums[i] != nums[nums[i]-1]){
                int temp = nums[i];
                nums[i] = nums[nums[i]-1];
                nums[elem-1] = temp;
            }
            else i++;
        }// end while
        for(int j = 0; j < nums.length;j++){
            if(nums[j] != j+1) return j+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        //int[] num = {3,0,1};
        int[] num = {0,1};


        System.out.println(missingNumber(num));
    }
}
