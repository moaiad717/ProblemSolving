/**
 * https://practice.geeksforgeeks.org/problems/third-largest-element/1
 */
public class ThirdLargestElement {

    public static void main(String[] args) {
        System.out.println(thirdLargest(new int[]{2,4,1,3,5} ,5));
    }
    static int thirdLargest(int a[], int n) {
        // Your code here
        if (n < 3) {
            return -1;
        }
        int max = 0;
        int max2 = 0;
        int max3 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                if (max != 0) {
                    max3 = max2;
                    max2 = max;
                    max = a[i];
                } else {
                    max = a[i];
                }
            }else if (a[i]>max2){
                max3=max2;
                max2=a[i];
            }
            else if (a[i]> max3)
                max3=a[i];
        }
        return max3;
    }
}
