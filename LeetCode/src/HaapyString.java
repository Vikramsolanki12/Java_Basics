public class HaapyString {
    public static int count;
    public static String ans;
    public static void generate(String sb,int n, int k){
        if(sb.length()==n){
            count++;
            if(count == k){
                ans = sb;
            }
            return;
        }
        char prev = '@';
        char[] ch = {'a','b','c'};
        for (int i = 0; i < ch.length; i++) {
            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != ch[i]) {
                generate(sb + ch[i], n,k);
            }
        }

    }
    public static void main(String[] args) {
        int n =3;
        int k =9;
        generate("",n,k);
        System.out.println(ans);
    }
}