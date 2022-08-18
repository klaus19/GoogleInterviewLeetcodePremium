package DynamicProgramming;

//[4,3,2,1]

public class HouseRobber {

    public int houseRobber(int nums[]){

        int money = nums[0];

        for (int i=1;i<nums.length;i++){
            if (i%2!=0){
                int curr = money+nums[i+1];
                money = Math.max(curr,money);
            }


            if (nums.length==2){
                money = Math.max(money,nums[i-1]);
            }
        }
        return money;
    }


    public static void main(String[] args) {
        HouseRobber hps = new HouseRobber();
        int[]str = new int[]{4,3,2,1};
        System.out.println(hps.houseRobber(str));
    }
}
