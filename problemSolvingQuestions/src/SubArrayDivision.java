import java.util.List;

/**
 *  https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
public class SubArrayDivision {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        int length = s.size();
        int numWays = 0, sum = 0;

        for(int i = 0 ; i <= (length - m) ; i++){
            for(int j = 0 ; j < m ; j++){
                sum = sum + s.get(j+i);
            }
            if(sum == d){
                numWays++;
            }
            sum = 0;
        }
        return numWays;
    }

}
