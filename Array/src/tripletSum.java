import java.util.Arrays;

public class tripletSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,12,6,9};
        int n=10;

        System.out.println("method 1:");
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == n){
                        System.out.println(arr[i] + "," +arr[j] + "," + arr[k]);
                    }
                }
            }
        }

        System.out.println("method 2:");
        Arrays.sort(arr);
        for(int i=0 ; i<arr.length ; i++){
            int left = i+1;
            int right = arr.length-1;

            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];

                if(sum == n){
                    System.out.println(arr[i]+","+arr[left]+","+arr[right]);
                    left++;
                    right--;
                }else if(sum<n){
                    left++;
                }else {
                    right--;
                }
            }
        }
    }
}
