public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {2,5,10,34,56,96,99,105};

        int x=25;
        int lo=0;
        int hi=arr.length-1;
        int lb=arr.length;
        while (lo<=hi){
            int mid = (lo+hi)/2;

            if(arr[mid]>=x){
                lb=Math.min(lb,mid);
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        System.out.println(lb);
    }
}
