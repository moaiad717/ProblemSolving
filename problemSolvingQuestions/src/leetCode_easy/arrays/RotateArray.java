package leetCode_easy.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7},8);
    }
    static Queue<Integer> integers = new LinkedList<>();
    public static   void rotate(int[] nums, int k) {
        int size= nums.length;
        k= k%size;
        if (nums.length==1 || k ==0)
            return;
        else {
            for (int i = size - k; i < size; i++) {
                integers.add(nums[i]);
            }
            for (int n = 0; n <= nums.length - k - 1; n++) {
                integers.add(nums[n]);
            }
            for (int i =0;i< size;i++){
                nums[i]=integers.poll();
            }
        }
    }
}
