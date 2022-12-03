package arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {

    public static String[] uniqueNames(String[] names1, String[] names2) {

        Set<String> names = new HashSet<>(List.of(names1));
        for (String name: names2){
            names.add(name);
        }

        return names.toArray(new String[names.size()]);

    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
