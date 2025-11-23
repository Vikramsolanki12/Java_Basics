public class checkSorted {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,12,15,20,28,47,68,90};

        boolean is_sorted=false;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>arr[i-1]){
                is_sorted = true;
            }
            else{
                is_sorted = false;
            }
        }
        if(is_sorted) System.out.println("array is sorted");
        else System.out.println("array is not sorted");
    }
}
