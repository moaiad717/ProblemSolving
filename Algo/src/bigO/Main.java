package bigO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int number = 100;
        int total=0;

        for (int i = 1; i <=number ; i++) { // O(n)
            total+=i;
        }

        int [][] mm =  {{4,6,4},{2,3,5}};
        for (int i = 0; i < mm.length; i++) {
            for (int j = 0; j< mm[i].length; j++){
                System.out.print(mm[i][j]); // O(n^2)
            }
            System.out.println(); //O(n)
        }
//
    }
}
