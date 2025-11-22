public class rotateArrayWithoutUsingExtraArray {
    public static void printArray(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void reverseArray(int[] arr, int i , int j){
        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        printArray(arr);
        int n = arr.length;
        int k = 11;

        k=k%n;
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);

        printArray(arr);

    }
}
