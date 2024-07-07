package arrays;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequent {

    public static void main(String[] args) {
        int [] res= topKFrequent(new int[]{3,0,1,0},1);

        for (int i : res){
            System.out.println(i);
        }
    }


    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, List<Integer>> intCountMap= new HashMap<>();
        for (int i: nums){
            intCountMap.computeIfAbsent(i, num -> new ArrayList<>()).add(i);
        }
        intCountMap.entrySet().stream().sorted((e,z) ->z.getValue().size() -e.getValue().size()).limit(k).mapToInt(Map.Entry::getKey).toArray();


        Map<Integer, Integer> freqMap = new HashMap<>();
      for (int num : nums){
          freqMap.put(num, freqMap.getOrDefault(num,0)+1 );
      }

        int []result2 = freqMap.entrySet().stream().sorted((e, z) -> e.getValue() - z.getValue()).limit(k).mapToInt(Map.Entry::getKey).toArray();


        PriorityQueue <Integer> priorityQueue= new PriorityQueue<>((a,b)-> freqMap.get(b)-freqMap.get(a));
        priorityQueue.addAll(freqMap.keySet());
        int [] result = new int[k];
        for (int i =0; i<k; i++){
            result[i] = priorityQueue.poll();
        }
        return result;

    }

//    public static int[] topKFrequent(int[] nums, int k) {
//        if (nums.length ==k)
//            return nums;
//
//        Map<Integer, Integer> numsMap= new TreeMap<>(Collections.reverseOrder());
//        Arrays.sort(nums);
//
//        int slow=0;
//        int fast =1;
//        int count=1;
//
//        while (fast< nums.length && slow < nums.length){
//            if(nums[slow] == nums[fast]){
//                count ++;
//                fast++;
//
//                if (fast == nums.length)
//                    numsMap.put(count, nums[slow]);
//            }
//            else {
//             numsMap.put(count, nums[slow]);
//             slow=fast;
//             fast++;
//             count=0;
//            }
//        }
//
//        int [] result = new int [k];
//        int counter =0;
//
//        for (Map.Entry<Integer,Integer> entry : numsMap.entrySet()){
//            if (counter <k){
//                result[counter] = entry.getValue();
//                ++counter;
//            }
//        }
//        return result;
//    }
}