package heap;


import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/k-closest-points-to-origin/description/
 */
public class KClosestPointToOrigin {

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(e -> (e[0] * e[0] + e[1] * e[1])));

        for(int [] arr: points){
            priorityQueue.add(arr);
        }

        int [][] res = new int[k][2];
        for (int i =0; i< k; i++){
            res[i]= priorityQueue.poll();
        }

        return res;

    }
}
