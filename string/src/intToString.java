import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        String s = "";
        s +=n;
        System.out.println(s);
    }
}
