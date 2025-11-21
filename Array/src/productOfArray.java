public class productOfArray {
    public static void main(String[] args) {
        int[] arr = {3,5,12,30,15,40,98,56,78};

        double product = 1;
        for(int i = 0; i < arr.length ; i++){
            product *= arr[i];
        }
        System.out.println("product of the array is : " + product);
    }
}
