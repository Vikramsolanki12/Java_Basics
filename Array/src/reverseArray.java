public class reverseArray {
    public static void printArray(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        printArray(arr);
        int n = arr.length;
        for(int i =0 ; i< n/2 ;i++){
            int temp = arr[i];
            arr[i]= arr[n-1-i];
            arr[n-1-i]=temp;
        }
        printArray(arr);

    }
}
