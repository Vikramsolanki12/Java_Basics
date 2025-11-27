import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter number of rows:");
        int row = scn.nextInt();
        System.out.print("\nenter number of columns:");
        int column = scn.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("enter elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = scn.nextInt();
            }
            System.out.println();
        }
        System.out.println("your array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(arr[i][j]>max) max=arr[i][j];
            }
        }
        System.out.println("largest element is:"+max);

    }
}
