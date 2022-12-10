import java.util.Arrays;

public class GCD {

    public static void main(String[] args) {
        System.out.println(findGCD(new int[]{7,5,6,8,3}));
    }

    public static int findGCD(int[] nums) {

        Arrays.sort(nums);
        int min=nums[0];
        int max = nums[nums.length-1];

        for (int i =min ; i>0 ; i--){
            if(min % i ==0 && max%i ==0)
                return i;
        }

        return 0;

    }
}
