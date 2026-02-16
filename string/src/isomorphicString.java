import java.util.Scanner;

public class isomorphicString {
    public static boolean isIsomorphic(String s, String t){
        char[] a = new char[128];

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);

            int idx = (int)ch;

            if(a[idx]=='\0') a[idx]=dh;
            else{
                if(a[idx] != dh) return false;
            }
        }

        for(int i=0 ; i<128 ; i++){
            a[i]='\0';
        }

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);

            int idx = (int)ch;

            if(a[idx]=='\0') a[idx]=dh;
            else{
                if(a[idx] != dh) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter first string:");
        String s = scn.next();
        System.out.print("enter second string:");
        String t = scn.next();

        boolean ans = isIsomorphic(s,t);
        System.out.println(ans);
    }
}
