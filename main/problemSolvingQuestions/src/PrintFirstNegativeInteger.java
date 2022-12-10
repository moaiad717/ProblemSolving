/**
 * https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1/?page=2&company[]=Amazon&sortBy=latest
 */
public class PrintFirstNegativeInteger {


    public static void main(String[] args) {
        long [] num = {8 ,2,-3, 3, -6, 10};
//        long [] num = {12,-1,-7,8,-15,30,16,28};

        printFirstNegativeInteger(num,5,2);
    }
    public static long[] printFirstNegativeInteger(long A[], int N, int K)

    {
        long [] res =  new long[N-K+1];
        int idx = K-1;
        int place=0;
        for (int i =0; i <=idx; ){

            if(A[i]< 0){
                res[place]=A[i];
                i= place+1;
                idx++;
                place++;
                if (idx<=N-1)
                    continue;
                else break;
            }
            else if (i>=idx && idx <N-1){
                i=place+1;
                idx++;
                place++;
            }
            else ++i;


//            if (i>idx && idx <N-1){
//                i=place+1;
//                idx++;
//                place++;
//            }
        }

        return res;
    }
}
