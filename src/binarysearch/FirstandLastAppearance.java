package binarysearch;

public class FirstandLastAppearance {

    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = findFirstIndex(nums,target);
        arr[1] = findLastIndex(nums,target);
        return arr;
    }
    // Here we find the First Index
    public int findFirstIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        int pos = -1;
        while(start <= end){
            int mid = start + (end- start) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid -1;
            }else{
                pos = mid;
                end = mid - 1;
            }
        }
        return pos;
    }
    // Here we find the Last Index
    public int findLastIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        int pos = -1;
        while(start <= end){
            int mid = start + (end- start) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid -1;
            }else{
                pos = mid;
                start = mid + 1;
            }
        }
        return pos;
    }
}
