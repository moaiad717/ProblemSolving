package twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        List<List<Integer>> threeSum = new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        threeSum.forEach(e -> {
            e.forEach(System.out::print);
            System.out.println();
        });
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {

            if (i != 0 && nums[i] == nums[i - 1]) continue;

            if (nums[i] > 0) break;

            int left = i + 1;
            int right = nums.length - 1;


            while (left < right) {
                int res = nums[i] + nums[left] + nums[right];


                if (res == 0) {
                    results.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                } else if (res > 0) right--;
                else left++;

            }


        }
        return results;
    }
}
