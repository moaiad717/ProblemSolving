import java.util.HashMap;
import java.util.Map;

public class TheGroup {
    public static void main(String[] args) {
        StringBuilder db = new StringBuilder ();
        Map<String, String> sb = new HashMap<>();
        sb.put("s",null);
        sb.put("m","Moaiad");

        db.append(sb.get("s"));
        db.append(sb.get("m"));

        System.out.println(db);
    }
}
