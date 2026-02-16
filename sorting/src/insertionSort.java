public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,67,34,23,87,18};
        int n = arr.length;
        for( int ele : arr){
            System.out.print(ele+" ");
        }

        for(int i=1 ; i<n ; i++){
            int j =i ;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]= temp;
                j--;
            }
        }
        System.out.println();
        for( int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
