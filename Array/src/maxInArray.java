public class maxInArray {
    public static void main(String[] args) {
        int[] arr = {3,6,9,340,12,56,45,89};

        int max = arr[0];

        for(int i=0 ; i<arr.length ;i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("maximum element in array is:"+max);
    }
}
