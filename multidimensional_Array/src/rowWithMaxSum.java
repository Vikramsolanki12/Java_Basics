public class rowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{3,4,7,8},{1,4,12,3}};

        int maxSum=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0 ; i<arr.length ; i++){
            int rowSum=0;
            for(int j=0 ; j<arr[0].length ; j++){
                rowSum += arr[i][j];
            }
            if(rowSum>maxSum){
                ans = i;
            }
        }
        System.out.println("maximum sum row is:"+ans);
    }
}
