package Greedy;

import java.util.ArrayList;
import java.util.List;

public class MaximumSplitPositiveEvenIntegers {


    public List<Long> maximumEvenSplit(long finalSum) {
        if(finalSum%2 != 0) {
            return new ArrayList<>();
        }

        long sum = 0;
        long i = 2;

        List<Long> answer = new ArrayList<>();

        // Keep adding all the even integers starting from 2 until the sum becomes greater than finalSum
        while(sum <= finalSum) {
            if(sum + i > finalSum)
                break;
            sum = sum + i;
            answer.add(i);
            i = i+2;
        }

        if(sum == finalSum) {
            return answer;
        }

        /* Remove the last element and add the remaining difference to the last number and return the answer.
        For example: Input - 8
        We first add 2, then 4
        Now we check 2+4+6 is ater than 8. So we pop the last element and add
        the difference to it.
        We remove 4. Then add 4+2 which is 6. We then add 6 into the list to get
        [2,6]. */
        int lastElementIndex = answer.size() - 1;
        long lastElement = answer.get(lastElementIndex);
        answer.remove(lastElementIndex);
        answer.add(lastElement + (finalSum - sum));
        return answer;

    }

}
