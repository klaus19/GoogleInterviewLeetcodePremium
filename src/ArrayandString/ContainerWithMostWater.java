package ArrayandString;

//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.

//Return the maximum amount of water a container can store.

public class ContainerWithMostWater {

    public  int maxHeight(int []height){

        int max_area=0;
        int a_pointer=0;
        int b_pointer=height.length-1;

        while (a_pointer<b_pointer){
            if(height[a_pointer]<height[b_pointer]){
                max_area = Math.max(max_area,height[a_pointer]*height[b_pointer-a_pointer]);
                a_pointer++;
            }else {
                max_area = Math.max(max_area,height[b_pointer]*height[b_pointer-a_pointer]);
                b_pointer--;
            }
        }

        return max_area;

    }

    public static void main(String[] args) {
        
    }

}
