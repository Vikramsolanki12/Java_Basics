public class findSmallestPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,10};
        int i =0;
        int j= arr[0];
        while(i<arr.length){
            if(arr[i] != j){
                System.out.println(j);
                break;
            }
            i++;
            j++;
        }
    }
}
