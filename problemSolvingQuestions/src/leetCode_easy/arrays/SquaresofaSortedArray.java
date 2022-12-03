package leetCode_easy.arrays;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresofaSortedArray {


    public int[] sortedSquares(int[] nums) {
       int left =0, n=nums.length, right =n-1;
       int result [] = new int[n];

       for (int i = n-1;n >-1; i--){
           if (Math.abs(nums[left])>Math.abs(nums[right])){
               result[i] = nums[left]* nums[left];
               left++;
           }
           else {
               result[i] = nums[right]* nums[right];
               right--;
           }
       }
        return result;
    }
}
//
//    int n=nums.length, p1=0, p2=n-1;
//    int[] result = new int[n];
//        for(int i=n-1; i>-1; i--){
//                if(Math.abs(nums[p1]) < Math.abs(nums[p2]))
//        result[i] = nums[p2] * nums[p2--];
//        else
//        result[i] = nums[p1] * nums[p1++];
//        }
//        return result;
