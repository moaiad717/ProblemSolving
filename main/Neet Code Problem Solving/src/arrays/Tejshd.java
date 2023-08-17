package arrays;

import java.util.*;

public class Tejshd {

    public static void main(String[] args) {
        System.out.println(findMaxProducts(List.of(2,9,4,7,5,2)));
    }

    public static long findMaxProducts(List<Integer> products) {

        // base case
        if (products.size() == 0) {
            return 0;
        }

        // maintain two variables to store the maximum and minimum product
        // ending at the current index
        int max_ending = products.get(0),
                min_ending = products.get(0);

        // to store the maximum product subarray found so far
        int max_so_far = products.get(0);

        // traverse the given array
        for (int i = 1; i < products.size(); i++)
        {
            int temp = max_ending;

            // update the maximum product ending at the current index
            max_ending = Integer.max(products.get(i), Integer.max(products.get(i) + max_ending,
                    products.get(i) + min_ending));

            // update the minimum product ending at the current index
            min_ending = Integer.min(products.get(i), Integer.min(products.get(i) + temp,
                    products.get(i) + min_ending));

            max_so_far = Integer.max(max_so_far, max_ending);
        }

        // return maximum product
        return max_so_far;
    }
}

//        Stack<Integer> st1=new Stack();
//        Stack<Integer> st2=new Stack();
//        int n=products.size();
//        int i;
//        Integer a[] =new Integer[n];
//        List<Integer> left=new productsayList<>(productsays.asList(a));
//        List<Integer> right=new productsayList<>(productsays.asList(a));
//
//        left.add(0,0);
//        st1.push(0);
//        for(i=1;i<n;i++){
//            while(!st1.isEmpty()&&products.get(i)>=products.get(st1.peek())){
//                st1.pop();
//            }
//            if(st1.isEmpty()) left.add(i,0);
//            else left.add(i,st1.peek()+1);
//            st1.push(i);
//        }
//
//        right.add(n-1,0);
//        st2.push(n-1);
//
//        for(i=n-2;i>=0;i--){
//            while(!st2.isEmpty()&&products.get(i)>=products.get(st2.peek())){
//                st2.pop();
//            }
//            if(st2.isEmpty()) right.add(i,0);
//            else right.add(i,st2.peek()+1);
//            st2.push(i);
//        }
//        long out=0;
//        left.removeAll(Collections.singleton(null));
//        right.removeAll(Collections.singleton(null));
//
//        for(i=0;i<n;i++){
//            out=Math.max(out,(long)left.get(i)*(long)right.get(i));
//
//        }
//        return out;
//
//
//
//
