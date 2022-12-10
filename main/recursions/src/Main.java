public class Main {

    public static void main(String[] args) {
//        myRecursion1(20);
//        myRecursion2("Moaiad");

        System.out.println(fuct(5));
//        myRecursion4(0);
    }

    static void myRecursion4 (int count){
        if (count > 100){
            return;
        }
        System.out.println(count);

        myRecursion4(count+1);
//        System.out.println(count);
    }

    static void myRecursion1(int z){
        System.out.println("Moaiad " +z);
        if (z!=0)
            myRecursion1(--z);
    }


    /**
     * reverse Word
     * @param s
     */
    static void myRecursion2(String s){
        if (s.length()!=1)
            myRecursion2(s.substring(1));

        System.out.print(s.charAt(0));
    }

    /**
     * Factorial impl
     * @param n
     * @return
     */

    static int fuct(int n){
        if (n ==0)
            return 1;
        else
            return n *  (n-1);

    }
}
