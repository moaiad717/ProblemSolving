import java.util.Arrays;

public class AddOne {
    static int i ;
    static boolean firstItt=true;

    public static void main(String[] args) {
        Arrays.stream(plusOne(new int[]{9,9})).forEach(System.out::print);
    }


    public static int[] plusOne(int[] digits) {
        if(firstItt){
            i = digits.length-1;
            firstItt=false;
        }

        // if array element is less than 9, then
        // simply add 1 to this.
        if (digits[i] < 9) {
            digits[i] = digits[i] + 1;
            return digits;
        }

        // if array element is greater than 9,
        // replace it with 0 and decrement i
        digits[i] = 0;
        i--;
        if (i<0){
            int[] res = new int[digits.length +1];
            res[0]=1;
            for (int i =1; i< res.length; i++){
                res[i]=0;
            }
            return res;
        }

        // recursive function
        return plusOne(digits);

    }
}
