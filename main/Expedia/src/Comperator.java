import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Comperator {


    public static void main(String[] args) {
        System.out.println(  pthFactor(10,3));

//        System.out.println(scatterPalindrome(List.of("aabb")));
    }

    public static List<Integer> scatterPalindrome(List<String> strToEvaluate) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (String str : strToEvaluate) {
            int n = str.length();
            if (str == null) {
                return new ArrayList<>();
            }
            HashMap<Character, Integer> charsMap = new HashMap<>();
            int count=0;

            for (int i = 0; i < n; i++) {
                int numEven = 0;
                int numOdd = 0;
                charsMap= new HashMap<>();
                for (int j = i + 1; j < n + 1; j++) {
                    char currentChar = str.charAt(j - 1);
                    charsMap.put(currentChar, charsMap.getOrDefault(currentChar, 0) + 1);
                    int curCount = charsMap.get(currentChar);
                    if (curCount % 2 == 0) {
                        numEven++;
                        numOdd--;
                    } else {
                        numOdd++;
                        if (numEven > 0) {
                            numEven--;
                        }
                    }
                    if (numEven == charsMap.size() || numOdd == 1) {
                        count++;
                    }
                }
            }
            result.add(count);
        }
        return  result;
    }


    public static long pthFactor(long n, long p) {
        long count=0;
        if(p >(n/2)+1 )
            return 0;

        for (long i=1; i<=n ;i++){
            if (n%i==0) {
                count++;
                n= n/i;
            }

            if (count==p)
                return i;
        }

        return 0;


//         Write your code here

    }







//    boolean compare(int a, int b){
//        if (a==b)
//            return true;
//
//        return false;
//    }
//
//    boolean compare(String a, String b){
//        if (a==null || b ==null)
//            return false;
//        if (a.equals(b))
//            return true;
//
//        return false;
//    }
//    boolean compare(int [] a, int [] b){
//        if ( Arrays.equals(a,b))
//            return true;
//        return false;
//    }
}
