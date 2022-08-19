package DynamicProgramming;

//[4,3,2,1]

public class HouseRobber {

    public int houseRobber(int nums[]){

        int money = nums[0];

        for (int i=1;i<nums.length-1;i++){
            if (i%2!=0){
                int curr = money+nums[i+1];
                money = Math.max(curr,nums[i]);
            }

        }

        if (nums.length==2){
            money = Math.max(money,nums[1]);
        }

        return money;
    }


    public static void main(String[] args) {
        HouseRobber hps = new HouseRobber();
        int[]str = new int[]{4,3,2,1};
        int[]rob = new int[]{1,2};
        System.out.println(hps.houseRobber(str));
        System.out.println(hps.houseRobber(rob));
    }
}
