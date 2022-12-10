package arrays;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class TopKFrequent {

    public static void main(String[] args) {
        int [] res= topKFrequent(new int[]{3,0,1,0},1);

        for (int i : res){
            System.out.println(i);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length ==k)
            return nums;

        Map<Integer, Integer> numsMap= new TreeMap<>(Collections.reverseOrder());
        Arrays.sort(nums);

        int slow=0;
        int fast =1;
        int count=1;

        while (fast< nums.length && slow < nums.length){
            if(nums[slow] == nums[fast]){
                count ++;
                fast++;

                if (fast == nums.length)
                    numsMap.put(count, nums[slow]);
            }
            else {
             numsMap.put(count, nums[slow]);
             slow=fast;
             fast++;
             count=0;
            }
        }

        int [] result = new int [k];
        int counter =0;

        for (Map.Entry<Integer,Integer> entry : numsMap.entrySet()){
            if (counter <k){
                result[counter] = entry.getValue();
                ++counter;
            }
        }
        return result;
    }
}