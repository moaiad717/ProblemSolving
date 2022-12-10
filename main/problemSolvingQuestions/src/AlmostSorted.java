import java.util.ArrayList;
import java.util.List;

public class AlmostSorted {
    public static void main(String[] args) {
        List <Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(8);

        almostSorted(list);

        List <Integer> list2= new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(6);
        list2.add(4);
        list2.add(5);
        list2.add(3);
        list2.add(7);
        list2.add(8);

        almostSorted(list2);
    }


    public static void almostSorted(List<Integer> arr) {
        // Write your code here


        int upperIndex = 0;
        int downIndex;
        boolean isreverse= true;
        boolean isSortedAlready =true;

        for (int i= 0; i <arr.size()-1;i++){
            if (arr.get(i)<arr.get(i+1))
                continue;
            else {
                upperIndex=i;
                isSortedAlready=false;
                break;
            }
        }

         downIndex = upperIndex+1;
        for (int z = downIndex; z<arr.size()-1;z++){
            if (arr.get(upperIndex) > arr.get(z+1))
                downIndex=z+1;
            else break;

            if ((arr.get(downIndex) > arr.get(downIndex-1))){
                isreverse =false;
            }
        }
        //Two numbers only , Swap Them
        if (downIndex-upperIndex==1)
            isreverse=false;

        if (isreverse){
            int up = upperIndex;
            int down = downIndex;
            while (up<down){
                int swap = arr.get(up);
                arr.set(up, arr.get(down));
                arr.set(down,swap);
                up++;
                down--;
            }

        }

        if (!isreverse){
            int temp = arr.get(upperIndex);
            arr.set(upperIndex,arr.get(downIndex));
            arr.set(downIndex,temp);
        }


        boolean sortedNow= true;
        for (int i= 0; i <arr.size()-1;i++){
            if (arr.get(i)<arr.get(i+1))
                continue;
            else {
                sortedNow=false;
                break;
            }
        }



        if (isSortedAlready)
            System.out.println("yes");
        else if (!sortedNow)
            System.out.println("no");

        else if (isreverse) {
            downIndex++;
            upperIndex++;
            System.out.println("yes");
            System.out.println("reverse " +upperIndex+" "+ downIndex);
        }
        else {
            downIndex++;
            upperIndex++;
            System.out.println("yes");
            System.out.println("swap " + upperIndex + " " + downIndex);
        }
    }


    }

