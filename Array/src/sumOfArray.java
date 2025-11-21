public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {3,5,12,30,15,40,98,56,78};

        int sum=0;
        for(int i = 0; i < arr.length ; i++){
            sum += arr[i];
        }
        System.out.println("sum of the array is : "+sum);
    }
}
