public class findMissingNumber {
    public static void swap(int i,int j ,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,1,0,5,2};
        int n = arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==i || arr[i]==n) i++;
            else{
                swap(i,arr[i],arr);
            }
        }
        for(i=0 ; i<n ; i++){
            if(arr[i]!=i) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(i);
    }
}
