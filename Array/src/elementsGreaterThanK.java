public class elementsGreaterThanK {
    public static void main(String[] args) {
        int[] arr = {3,5,1,12,67,45,90,34,23,16,5,78};
        int k =78;
        for(int i=0 ;i<arr.length ;i++){
            if(arr[i]>k){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
