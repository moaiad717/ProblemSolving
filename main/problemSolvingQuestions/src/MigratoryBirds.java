import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/migratory-birds/problem?
 */
public class MigratoryBirds {

    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1 ,4 ,4 ,4 ,5 ,3)));
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here

        List<Integer> birds= new ArrayList<>();
        birds.add(0);
        birds.add(0);
        birds.add(0);
        birds.add(0);
        birds.add(0);

        for (int i = 0; i<arr.size();i++){
            int value= arr.get(i) -1;
            birds.set(value, birds.get(value)+1);
        }
        int m = birds.stream().max((e,x)->e.compareTo(x)).get();
        return birds.indexOf(m)+1;
    }

}
