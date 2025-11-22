import java.util.Scanner;

public class DutchFlagProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0 ;i<n ;i++){
            arr[i] = scn.nextInt();
        }

        int high=n-1, low=0 , mid=0;

        while(mid<=high){
            if(arr[mid]== 0){
                int temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid]= arr[high];
                arr[high]= temp;
                high--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
