import java.util.Scanner;

public class mostOccurance {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int[] freq = new int[26];

        for(int i=0 ; i<str.length();i++){
             char ch = str.charAt(i);
             int idx = (char)ch-97;
             freq[idx]++;
        }
        int maxFeq = -1;
        for(int i=0 ; i<freq.length;i++){
            maxFeq= Math.max(maxFeq,freq[i]);
        }
        for(int i=0 ; i<freq.length;i++){
            if(freq[i]==maxFeq){
                char ch = (char)(i+97);
                System.out.print(ch);
            }
        }
    }
}
