public class trappingRainWaterProblemOptimized {
    public static void main(String[] args) {
        int[] arr = {3,0,1,0,4,0,2};

        int left=0 , right=arr.length-1;
        int leftMax=0 , rightMax=0;
        int res = 0;

        while (left<right){
            if(arr[left]<arr[right]){
                if(arr[left]>=leftMax){
                    leftMax=arr[left];
                }else{
                    res += leftMax-arr[left];
                }
                left++;
            }else{
                if(arr[right]>=rightMax){
                    rightMax=arr[right];
                }else{
                    res += rightMax-arr[right];
                }
                right--;
            }
        }
        System.out.println(res);
    }
}
