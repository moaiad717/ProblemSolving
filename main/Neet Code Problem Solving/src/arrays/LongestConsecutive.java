package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        int max =0;
        Set<Integer> numsSet = new HashSet<>();
        for(int num:nums){
            numsSet.add(num);
        }
        

        for (int num : nums){

            if (numsSet.contains(num-1))
                continue;

            else{
                int count =0;
                while (numsSet.contains(num++)){
                    count++;
                }
                max= Math.max(max,count);
            }

        }
        return max;
    }
}
