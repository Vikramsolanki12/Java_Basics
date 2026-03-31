import java.util.Scanner;

public class power {
    public static  int power(int a, int b){
        if(b==0) return 1;
        int ans = power(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(power(a,b));
    }
}
