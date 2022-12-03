public class InsertionSort {

    public static void main(String[] args) {
        int[] myArr = {6, 4, 7, 2, 1, 8, 9};
        for (int i : myArr)
            System.out.print(i);
        System.out.println();
        System.out.println("After sort");
        int[] sorted = sort(myArr);
//        sort(sorted);
        for (int i : sorted)
            System.out.print(i);
    }

    //NOT READY
    static int[] sort(int[] arr) {
       for (int i =0; i<arr.length-1;i++){
           for (int j =i+1; j>0; j--){
               if (arr[j]< arr[j-1]){
                   int temp = arr[j];
                   arr [j] = arr[j-1];
                   arr[j-1]= temp;
               } else break;
           }
       }
       return arr;
    }
}
