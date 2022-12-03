package leetCode_easy.arrays;
/*
https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        int mid=0;
        while (left<=right){
            mid = (left+right) /2;

            if (nums[mid] == target)
                return mid;

            if (target< nums[mid]){
                right = mid-1;
            }else
                left=mid+1;
        }
        if (left>right)
            return left;

        return right;
    }
}
