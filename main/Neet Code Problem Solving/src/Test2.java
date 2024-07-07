import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        int [] charCounts= new int [26];

        Arrays.stream(charCounts).filter(e->e!=0).findAny().isPresent();
    }
}
