import java.util.Arrays;
import java.util.Comparator;

public class largestNumber {


    public static void main(String[] args) {
    }

    public String largestNumber(int[] nums) {
        String[] strings= new String[nums.length];

        for (int i =0; i< strings.length ;i++) {
            strings[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                String num1= s.concat(t1);
                String num2= t1.concat(s);
                return num1.compareTo(num2);
            }
        });
        return String.join("", strings);
    }
}
