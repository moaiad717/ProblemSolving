public class GCDOfStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        String min =str1;
        String max =str2;
        if (str1.length()> str2.length()){
            min = str2;
            max =str1;
        }
        int idx= min.length();

        while (idx>0){
            if (max.replaceAll(min.substring(0, idx),"").equals("") &&
                    min.replace(min.substring(0, idx),"").equals("")){
                return min.substring(0,idx);
            }
            idx--;
        }
        return "";
    }
}
