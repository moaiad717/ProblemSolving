package leetCode_easy.arrays;

public class binarySearch {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
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
        return -1;

    }
}
