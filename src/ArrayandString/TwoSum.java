package ArrayandString;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
// Asked in Google 38 times with O(n) time complexity

public class TwoSum {

    public int[]twoSum(int[]nums,int target){
        Map<Integer,Integer>map = new HashMap<>();


        for (int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(!map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No elements found");
    }
}
