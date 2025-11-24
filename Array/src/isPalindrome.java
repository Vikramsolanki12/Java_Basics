public class isPalindrome {
    public static void reversed(int[] arr){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void printArray(int[] arr){
        for(int k=0 ; k<arr.length ; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int[] nums = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            nums[i]=arr[i];
        }
        reversed(arr);
        boolean palindrome = true;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]!=nums[i]){
                palindrome=false;
                break;
            }
        }
        System.out.println(palindrome);
    }
}
