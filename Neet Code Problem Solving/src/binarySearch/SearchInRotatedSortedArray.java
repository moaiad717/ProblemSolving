package binarySearch;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {

        if (nums.length ==2){
            if (nums[0] == target)
                return 0;
            else if (nums[1]==target)
                return 1;
            else return -1;
        }


        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[mid] >= nums[left] ) {
                if(target> nums[mid] || target < nums[left])
                    left = mid + 1;
                else
                    right =mid-1;

            } else{
                if (target<nums [mid] ||target>nums[right] )
                    right=mid-1;

                else
                    left =mid+1;
            }


        }
        return -1;
    }
}
