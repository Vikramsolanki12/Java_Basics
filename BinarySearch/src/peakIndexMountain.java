public class peakIndexMountain {
    public static void main(String[] args) {
        int[] arr = {2,10,20,50,30,20,1};
        int n = arr.length;

        int low = 1;
        int high = n-2;
        int peak = 9833383;
        while(high>=low){
            int mid = low + (high-low)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
                peak=mid;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) low = mid+1;
            else high = mid-1;
        }
        System.out.println(peak);
    }
}
