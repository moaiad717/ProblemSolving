import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class OverlappedInterval {

    public static void main(String[] args) {
        int  [][] m = {{1,3},{2,4},{6,8},{9,10}};

        int [][] result = overlappedInterval(m);

        for (int [] i : result){
            System.out.println(i[0]+" " + i[1]);
        }
        LinkedList<Integer> l = new LinkedList<>();
    }

    public static int[][] overlappedInterval(int[][] Intervals)
    {
        Arrays.sort(Intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> a = new ArrayList<int[]>(Arrays.asList(Intervals));
        a.addAll(Arrays.asList(Intervals));

        int i = 0;
        while(i < a.size()-1){

            if(a.get(i)[1]>= a.get(i+1)[0]){

                if(a.get(i)[1]>=a.get(i+1)[1]){
                    a.remove(i+1);
                }else{
                    int[] newArr = new int[2];
                    newArr[0] = a.get(i)[0];
                    newArr[1] = a.get(i+1)[1];

                    a.remove(i+1);
                    a.remove(i);
                    a.add(i, newArr);
                }
            }else{
                i++;
            }
        }
        int[][] ans = new int[a.size()][2];
        for(int j = 0; j < a.size(); j++){
            ans[j][0] = a.get(j)[0];
            ans[j][1] = a.get(j)[1];
        }
        return ans;
}
}
