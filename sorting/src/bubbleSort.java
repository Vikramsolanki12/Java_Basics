public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,67,34,23,87,18};
        int n = arr.length;
        for( int ele : arr){
            System.out.print(ele+" ");
        }

        for(int i=0 ; i<n-1 ; i++){
            for(int j=0 ; j<n-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        for( int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
