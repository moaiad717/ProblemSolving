public class Moaiad {
    public static void main(String[] args) {
        System.out.println(isEvenIndex("saaenjfmiouw",'u'));
    }

    static boolean isEvenIndex (String s , char item){
      int count =0;
        for (int i =0; i<s.length()/2+1; i+=2){
            System.out.println(++count);
            if (s.charAt(i)==item)
                return true;
        }
        return false;
    }
}
