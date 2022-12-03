public class MedianOfTwoSortedArrays {
    /**
     * https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/
     *
     */


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] numArray= merge(nums1,nums2);
        double median;

        if (numArray.length % 2 == 0)
            median = ((double)numArray[numArray.length/2] + (double)numArray[numArray.length/2 - 1])/2;
        else
            median = (double) numArray[numArray.length/2];
        return median;

    }


    // Got it from Merge sort implementation
    static int [] merge (int [] left, int[] right){
        int [] result= new int[left.length + right.length];
        int leftPointer  =0;
        int rightPointer =0;
        int resultPointer=0;

        while (leftPointer< left.length &&  rightPointer< right.length)
        {
            if (left[leftPointer] <= right[rightPointer]){
                result[resultPointer]= left[leftPointer];
                resultPointer++;
                leftPointer++;
            }
            else {
                result[resultPointer]= right[rightPointer];
                resultPointer++;
                rightPointer++;
            }
        }

        while (leftPointer < left.length){
            result[resultPointer]= left[leftPointer];
            leftPointer++;
            resultPointer++;
        }
        while (rightPointer < right.length){
            result[resultPointer]= right[rightPointer];
            rightPointer++;
            resultPointer++;
        }

        return result;
    }

}
