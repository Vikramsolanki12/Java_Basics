public class changeOddEvenValue {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,12,15,20,28,47,68,90};

        for(int i=0 ; i<arr.length ; i+=2){
            arr[i] = arr[i]+10;
        }
        for(int i=1 ; i<arr.length ; i+=2){
            arr[i] = arr[i]*2;
        }
        for(int i=0 ;i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
