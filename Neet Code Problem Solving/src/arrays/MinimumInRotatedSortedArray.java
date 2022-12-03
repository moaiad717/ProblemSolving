package arrays;

public class MinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int res = nums[0];
        int left = 0;
        int right = nums.length-1;

        while (left<=right){

            if (nums[left] < nums[right]){
                res = Math.min(res, nums[left]);
                break;
            }
            else {
                int mid = (left+right)/2;
                res = Math.min(nums[mid], res);

                if (nums[mid]>=nums[left]){
                    left = mid+1;
                }
                else
                    right= mid-1;

            }
        }
        return res;

    }
}
