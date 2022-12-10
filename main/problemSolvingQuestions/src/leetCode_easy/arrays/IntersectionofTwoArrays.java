package leetCode_easy.arrays;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
 */

public class IntersectionofTwoArrays {

    public static void main(String[] args) {
        intersect(new int []{1,5,3,3,3,6,7,7,7,7},new int []{1,5,3,3,3,6,7,7,7,7,9});
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return intersect(nums2,nums1);
        Map<Integer , Integer> map = new HashMap<>();
        for (int num : nums1){
                map.put(num,map.getOrDefault(num,0) +1);
        }
        List <Integer> result = new ArrayList<>();

        for (int i : nums2){
            int count= map.getOrDefault(i,0);
            if (count>0){
                result.add( i);
                map.put(i, count-1);
            }
        }

        int[] resultArr = new int[result.size()];

       for (int i = 0; i <result.size() ; i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }
}
