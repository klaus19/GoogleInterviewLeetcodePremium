package ArrayandString;

public class PlusOne {
    public int[]plusOne(int[]nums) {

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i] += 1;
                return nums;
            }
            nums[i] = 0;
        }

        int[] hugePeen = new int[nums.length + 1];
        hugePeen[0] = 1;
        return hugePeen;



    }


}
