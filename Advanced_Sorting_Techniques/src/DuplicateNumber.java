import java.util.Scanner;

public class DuplicateNumber {
    public static void swap(int i ,int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] nums = new int[n+1];
        for(int i=0  ; i<n+1 ; i++) nums[i]=scn.nextInt();

        n = nums.length+1;
        int ans = -1;
        while(true){
            int ele = nums[0];
            if(ele >= nums.length) break;
            if(nums[ele] == ele){
                ans = ele;
                break;
            }
            swap(0, ele, nums);
        }
        System.out.print(ans);
    }
}
