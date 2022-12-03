package leetCode_easy.arrays;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
 */
public class PlusOne {
    public static void main(String[] args) {
        plusOne(new int[]{9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9});
    }
    public static int[] plusOne(int[] digits) {

        BigInteger digitVal= BigInteger.valueOf(0);
        for (int i = 0; i < digits.length; i++) {
            digitVal= digitVal.add(BigInteger.valueOf(digits[i]));

            if (i != digits.length-1)
                digitVal=digitVal.multiply(BigInteger.valueOf(10));
        }

        digitVal= digitVal.add(BigInteger.valueOf(1));
        ArrayList<Long> integers = new ArrayList<>();
        while (digitVal.toString()!="0"){
            integers.add(0,digitVal.mod(BigInteger.valueOf(10)).longValue());
            digitVal= digitVal.divide(BigInteger.valueOf(10));
        }

        int result []= new int[integers.size()];
        for (int i= 0; i<integers.size();i++){
            result[i] = integers.get(i).intValue();
        }
        return result;
    }
}
