public class sellectionSort {

    public static void main(String[] args) {
        int []myArr = {6,4,7,2,1,8,9};
        for (int i : myArr)
            System.out.print(i);
        System.out.println( );
        System.out.println("After sort");
        sort(myArr);
        for (int i : myArr)
            System.out.print(i);
    }

    static void sort (int [] arr){
        for (int i =0; i< arr.length; i++){
         int min = arr[i];
         int indexToSwap=-1;
            for (int j = i; j < arr.length-1 ; j++) {
                if (arr[j]<min){
                    min= arr[j];
                    indexToSwap = j;
                }
            }
            if (indexToSwap!=-1){
                int temp= arr[i];
                arr[i] = arr [indexToSwap];
                arr[indexToSwap]=temp;
            }
        }
    }
}
