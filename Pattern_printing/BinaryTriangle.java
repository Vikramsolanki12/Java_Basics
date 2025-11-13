import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scn.nextInt();

        for(int i = 1 ; i<=n;i++){
            for(int j = 1 ; j <= i ; j++){
                if((i+j)%2 == 1) System.out.print(0+" ");
                else System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}
