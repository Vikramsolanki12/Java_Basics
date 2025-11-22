import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i= 0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("Enter target element:");
        int x = scn.nextInt();

        boolean flag = false;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]==x){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("element found...");
        }else{
            System.out.println("element not found...");
        }

    }
}
