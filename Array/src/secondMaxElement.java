public class secondMaxElement {
    public static void main(String[] args) {
        int[] arr = {3,6,9,340,12,56,45,89};

        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ;i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("maximum element in array is:"+max);

        int smax = Integer.MIN_VALUE;
        for (int i=0 ; i<arr.length ;i++){
            if(arr[i] != max && arr[i]>smax) smax=arr[i];
        }
        System.out.println("second max element is:"+smax);
    }
}
