package leetCode_easy.strings;

/**
 * https://leetcode.com/problems/reverse-integer/
 */

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
    public static int reverse(int x) {
        if (x>=Integer.MAX_VALUE)
            return 0;
        long result=0;
        while (x!=0){
            result= result*10;
            result+=x%10;
            x=x/10;
            if (result > Integer.MAX_VALUE || result<Integer.MIN_VALUE)
                return 0;
        }

        return (int) result;
    }
}
