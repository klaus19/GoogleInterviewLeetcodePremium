package DynamicProgramming;

public class LongestSubArray {

    public int longestArraySum(int nums[]){
        int curr_sum=nums[0];
        int max_sum = curr_sum;

        //Base case. if length os Array is 1

        if (nums.length==1){
            return nums[0];
        }

        for (int i=1;i<nums.length;i++){
            curr_sum= Math.max(nums[i]+curr_sum,nums[i]);
            max_sum= Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        LongestSubArray ls = new LongestSubArray();
        int[]ans = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ls.longestArraySum(ans));
    }
}
