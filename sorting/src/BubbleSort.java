import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int []myArr = {6,4,7,9,2,1,8};
        printArray(myArr );

        System.out.println( );
        System.out.println("After sort");
        sort(myArr);
        printArray(myArr);

    }

    static int [] sort(int [] arr){
        boolean swapped= false;
        for (int i = 0 ; i < arr.length; i++)
            for (int j = 0; j <arr.length-1 ; j++) {
                if (arr[j]> arr[j+1]){
                    int temp = arr [j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swapped=true;
                }
                //If no swap happens this iteration, that mean the array is sorted and no need to do more iterations .
                if (!swapped)
                    break;
            }

        return arr;
    }

    static void  printArray (int [] arr){
        Arrays.stream(arr).forEach( e-> System.out.print(e));
        System.out.println();
    }
}
