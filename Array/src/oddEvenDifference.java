public class oddEvenDifference {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,12,15,20,28,47,68,90};

        int evenSum = 0;
        int oddSum =0;

        for(int i=0 ;i<arr.length ;i+=2){
            evenSum+=arr[i];
        }
        for(int i=1 ;i<arr.length;i+=2){
            oddSum+=arr[i];
        }
        System.out.println(evenSum-oddSum);
    }
}
