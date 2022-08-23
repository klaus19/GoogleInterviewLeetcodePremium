package binarysearch;

public class RandomPickWithWeight {


    private int[]prefixSums;
    private int totalSum;

    public void Solution(int[] w) {
        this.prefixSums = new int[w.length];

        int prefixSum=0;
        for(int i=0;i<w.length;++i){
            prefixSum+=w[i];
            this.prefixSums[i]=prefixSum;
        }


    }

    public int pickIndex() {
        double target = this.totalSum * Math.random();
        // run a binary search to find the target zone
        int low = 0, high = this.prefixSums.length;
        while (low < high) {
            // better to avoid the overflow
            int mid = low + (high - low) / 2;
            if (target > this.prefixSums[mid])
                low = mid + 1;
            else
                high = mid;
        }
        return low;

    }

}
