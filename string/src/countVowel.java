import java.util.Scanner;

public class countVowel {
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='A') return true;
        if(ch=='e'||ch=='E') return true;
        if(ch=='i'||ch=='I') return true;
        if(ch=='o'||ch=='O') return true;
        if(ch=='u'||ch=='U') return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=scn.nextLine();

        int count=0;
        for(int i=0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(isVowel(ch)) count++;
        }
        System.out.println("number of vowels is:"+count);
    }
}
