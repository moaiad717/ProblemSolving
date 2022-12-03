package arrays;

public class SearchRotatedSortedArray {


    public static void main(String[] args) {
        int [] arr = {5,1,3};
        System.out.println(search(arr,5));
    }
    public static int search(int[] nums, int target) {

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

            if (nums[mid] >= nums[left] && target >= nums[left] && target <=nums[mid] ) {
                right = mid - 1;

            }else
                left= mid+1;
        }
        return -1;

    }
}
