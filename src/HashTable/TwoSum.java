package HashTable;

import java.util.HashMap;
import java.util.Map;

//Time complexity will be O(n) and same is space complexity

public class TwoSum {

    public int[]twoSum(int[]nums,int target){
        Map<Integer,Integer>values = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            int comp = target-nums[i];
            if (!values.containsKey(comp)){
                 return new int[]{i,values.get(comp)};
            }
            values.put(nums[i],i);
        }
        throw new IllegalArgumentException("Matchec not found");
    }
}
