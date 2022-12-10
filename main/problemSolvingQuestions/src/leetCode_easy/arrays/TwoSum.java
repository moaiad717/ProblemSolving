package leetCode_easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * https://leetcode.com/problems/two-sum/submissions/
     *
     */

    public static void main(String[] args) {
            int[] nums = {2,7,11,15};
            twoSum(nums,18);
    }

    static int [] twoSum(int []arr, int target){
        Map<Integer,Integer> map= new HashMap<>();

        int[] m = new int[2];
        for (int i= 0; i< arr.length; i++){
            int curr = arr [i];
            if (map.containsKey(curr)){
                m= new int[]{map.get(curr),i};
            }
            else
                map.put(target-curr, i);
        }
        return m;

    }
}
