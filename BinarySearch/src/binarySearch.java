public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,10,34,56,96,99,105};
        int target = 1;

        int lo = 0;
        int hi = arr.length-1;

        boolean flag=false;

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target) {
                flag = true;
                break;
            }
            else if(arr[mid]>target) hi=mid-1;
            else lo = mid+1;
        }
        System.out.println(flag);
    }
}
