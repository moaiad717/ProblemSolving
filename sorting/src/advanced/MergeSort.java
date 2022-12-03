package advanced;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {4,5,6,1,3,7,2};
        int[] sorted=  sort(arr);

        for (int i : sorted) {
            System.out.print(i + " - ");
        }
    }

    static int [] sort(int[] arr){
       return splitAndMerge(arr);
    }

    static  int [] splitAndMerge(int [] ar){
        if (ar.length==1)
            return ar;

        int[] left = Arrays.copyOfRange(ar, 0, (ar.length + 1)/2);
        int[] right = Arrays.copyOfRange(ar, (ar.length + 1)/2, ar.length);

        int [] leftSplit= splitAndMerge(left);
        int[] rightSplit =splitAndMerge(right);
        return  merge(leftSplit,rightSplit) ;

    }


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
