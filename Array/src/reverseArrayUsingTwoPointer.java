public class reverseArrayUsingTwoPointer {
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

        int i = 0;
        int j= n-1;
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        printArray(arr);

    }
}
