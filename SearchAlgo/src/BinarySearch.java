public class BinarySearch {


    public static void main(String[] args) {
        System.out.println( bs( new int[]{2,3,4,7,8}, 9,0,4));
    }

    static  int bs (int [] arr , int target, int start, int end){
        int mid = (start + end)/2;

        if (end<start)
            return -1;

        if (arr[mid]==target)
            return mid;

        if (arr[mid]>target)
            return bs(arr, target, start, mid-1);
            else
            return bs(arr, target, mid+1, end);
    }
}
