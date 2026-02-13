import java.util.Scanner;

public class fibo {
    public static int fibo(int x){
        if(x==0 || x==1) return x;
        return fibo(x-1)+fibo(x-2);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        System.out.println(fibo(x));
    }
}
