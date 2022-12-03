package leetCode_easy.strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"a","a","a"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String sub ="";
        String initString= strs[0];
        if (initString.length()>0)
             sub = initString.substring(0,1);
        else
            return sub;

        UPPER:
        while (true){
            for (int i =0; i<strs.length; i++)
            {
                if (!strs[i].startsWith(sub)){
                    if (sub.length()>0)
                        sub= sub.substring(0,sub.length()-1);
                    break UPPER;
                }
            }
            if (initString.length() > sub.length()){
                sub=initString.substring(0, sub.length()+1);
            }else if (sub.length()==initString.length())
                return sub;
        }
        return sub;
    }
}
