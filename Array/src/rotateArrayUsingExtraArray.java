public class rotateArrayUsingExtraArray {
    public static void printArray(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        printArray(arr);
        int n = arr.length;
        int k = 10;

        k=k%n;

        int[] res = new int[n];
        int j =0;
        for(int i=n-k ;i<n ;i++){
            res[j]=arr[i];
            j++;
        }
        for(int i= 0;i<n-k;i++){
            res[j]=arr[i];
            j++;
        }
        printArray(res);
    }
}
