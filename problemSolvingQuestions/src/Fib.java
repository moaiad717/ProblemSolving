import java.util.HashMap;
import java.util.Map;

public class Fib {

    public static void main(String[] args) {
        // 1 1 2 3 5 8
        System.out.println(System.currentTimeMillis());
        System.out.println(new Fib().fib(50));
        System.out.println(System.currentTimeMillis());
        System.out.println("----------------------------");
        System.out.println(System.currentTimeMillis());
        System.out.println(new Fib().fib2(50));
        System.out.println(System.currentTimeMillis());
    }


    //Using
    Map<Integer, Integer> integerMap = new HashMap<>();
    public  int fib(int n){
        if (integerMap.containsKey(n))
            return integerMap.get(n);
        if (n<=2) return 1;

        integerMap.put(n,fib(n-1)+fib(n-2));
        return integerMap.get(n);
    }

    public  int fib2(int n){
        if (n<=2) return 1;
        return fib2(n-1)+fib2(n-2);
    }
}
