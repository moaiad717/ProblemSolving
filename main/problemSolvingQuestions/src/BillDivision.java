import java.util.List;

/**
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int cost =0;
        for (int i =0; i<bill.size();i++){
            if (i!=k)
                cost+=bill.get(i);
        }
        if (cost==0)
            return;
        if (cost/2 ==b)
        {
            System.out.println("Bon Appetit");
        }else
            System.out.println(b-cost/2);
    }

}
