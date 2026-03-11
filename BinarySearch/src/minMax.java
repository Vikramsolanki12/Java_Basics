public class minMax {
    public static boolean isPossible(int maxQ , int[] arr , int n){
        int stores = 0;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%maxQ==0){
                stores += arr[i]/maxQ;
            }else stores += arr[i]/maxQ+1;
        }
        if(stores>n) return false;
        return true;
    }
    public static void main(String[] args) {
        //leetcode-2064
        int[] arr = {15,10,10};
        int n =7;

        int m = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i =0 ; i<m ;i++){
            mx = Math.max(arr[i],mx);
        }
        int lo = 1;
        int hi = mx;
        int ans =0;

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;

            if(isPossible(mid, arr, n)){
                ans = mid;
                hi = mid-1;
            }else{
                lo=mid+1;
            }
        }
        System.out.println(ans);
    }
}
