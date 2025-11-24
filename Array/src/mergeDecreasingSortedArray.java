public class mergeDecreasingSortedArray {
    public static void reversed(int[] arr){
        int i = 0 , j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {15,12,9,7,1};
        int[] nums2 = {14,13,8,6,3,2};

        int m = nums1.length;
        int n = nums2.length;

        int[] ans = new int[m+n];

        int i=0 , j=0 , k=0 ;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                ans[k] = nums1[i];
                i++;
            }else{
                ans[k]=nums2[j];
                j++;
            }
            k++;
        }
        if(i==m){
            while(j<n){
                ans[k]=nums2[j];
                j++;
                k++;
            }
        }
        if(j==n){
            while(i<m){
                ans[k]=nums1[i];
                i++;
                k++;
            }
        }
        reversed(ans);
        for(int num : ans){
            System.out.print(num+" ");
        }
    }
}
