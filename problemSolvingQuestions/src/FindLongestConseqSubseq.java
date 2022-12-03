import java.util.Arrays;

/**
 * https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1/
 */
public class FindLongestConseqSubseq {

    public static void main(String[] args) {
        System.out.println(findLongestConseqSubseq(new int[]{1,1,2,3,4,5}, 5));
    }


    //Function to return length of longest subsequence of consecutive integers.
    static int findLongestConseqSubseq(int arr[], int N)
    {
        // add your code here

        Arrays.sort(arr);
        int max =0;
        int count =0;

        for (int i =1; i<arr.length; ){
            if (arr[i]-arr[i-1] ==1){
                ++count;
                ++i;
                max= Math.max(max,count);
            }else if (arr[i]== arr[i-1]){
                ++i;
                continue;
            }else {
                max= Math.max(max,count);
                ++i;
                count=0;
            }

        }

        return max+1;
    }
}
