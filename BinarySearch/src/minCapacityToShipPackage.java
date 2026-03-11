import java.util.Scanner;

public class minCapacityToShipPackage {
    public static boolean isPossible(int c , int[] arr , int d){
        int n = arr.length;
        int load=0;
        int days =1;

        for(int i=0 ;i<n ;i++){
            if(load+arr[i]<=c) load+=arr[i];
            else{
                load =arr[i];
                days++;
            }
        }
        if(days>d) return false;
        else return true;
    }
        public static void main(String[] args) {
            //Write your code here
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int[] arr = new int[n];
            for(int i=0 ; i<n ;i++){
                arr[i] =scn.nextInt();
            }
            int d = scn.nextInt();

            int mx = Integer.MIN_VALUE;
            int sum =0;

            for(int i=0 ;i<n ;i++){
                mx = Math.max(arr[i],mx);
                sum+=arr[i];
            }
            int lo=mx;
            int hi = sum;
            int minC = sum;

            while(lo<=hi){
                int mid = lo+(hi-lo)/2;

                if(isPossible(mid,arr,d)==true){
                    minC=mid;
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }
            System.out.println(minC);

        }
}
