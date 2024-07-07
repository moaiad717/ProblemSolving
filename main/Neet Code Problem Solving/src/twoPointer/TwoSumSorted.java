package twoPointer;


public class TwoSumSorted {

    public static void main(String[] args) {
        int[] ints = new TwoSumSorted().twoSum(new int[]{5,25,75}, 100);
        System.out.println(ints[0] +" -- "+ints[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end = numbers.length-1;

        while (start<end ){
            int sum = numbers[start]+numbers[end];
            if (sum ==target){
                return new int[]{++start, ++end};
            }

            else if (sum>target)
                end--;
            else
                start++;
        }

        return new int[]{0,0};
}}
