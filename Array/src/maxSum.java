import java.security.spec.RSAOtherPrimeInfo;

public class maxSum {
        public static void reverse(int[] arr, int i , int j){
            while(i<=j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        public static void rotateArray(int[] arr,int k){
            int n = arr.length;
            k=k%n;
            reverse(arr,0,n-k-1);
            reverse(arr,n-k,n-1);
            reverse(arr,0,n-1);
        }
        public static int RotateSum(int[] nums){
            int sum=0;
            for(int i=0;i<nums.length;i++){
                    sum += nums[i]*i;
            }
            return sum;
        }

    public static void main(String[] args) {
            int[] nums = {4,3,2,6};
            int maxSum =0;
            for(int k=0;k<nums.length;k++) {
                rotateArray(nums, k);
                int sum = RotateSum(nums);
                if (sum > maxSum) maxSum = sum;
            }

        System.out.println(maxSum);
    }
}
