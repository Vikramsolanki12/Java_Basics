import java.util.Scanner;

public class print1toN {
    public static void print(int x,int n){
        if(x>n) return;
        System.out.println(x);
        print(x+1,n);

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        print(1,n);
    }
}
