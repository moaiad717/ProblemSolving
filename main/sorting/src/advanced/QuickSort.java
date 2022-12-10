package advanced;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {16,3, 5, 2, 7, 1, 67, 3,9,12};
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " - ");
        }
    }

    static void sort(int[] arr, int pivot, int end) {

        int leftPos = pivot + 1;
        int rightPos = end;

        if (pivot > end)
            return;

        if (arr.length == 1)
            return;

        while (rightPos >= leftPos) {
            if (arr[leftPos] > arr[pivot] && arr[rightPos] < arr[pivot]) {
                int temp = arr[leftPos];
                arr[leftPos] = arr[rightPos];
                arr[rightPos] = temp;
            }

            if (arr[leftPos] <= arr[pivot]) {
                leftPos += 1;
            }
            if (arr[rightPos] >= arr[pivot]) {
                rightPos -= 1;
            }
        }

        int swap = arr[rightPos];
        arr[rightPos] = arr[pivot];
        arr[pivot] = swap;

        //Sort  the Left list
        sort(arr, pivot, rightPos - 1);

        //sort right list
        sort(arr, rightPos + 1, end);

    }

}
