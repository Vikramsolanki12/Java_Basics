import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        String s = n+"";
        System.out.println(s.length());
    }
}
