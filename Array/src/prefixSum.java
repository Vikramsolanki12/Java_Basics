public class prefixSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int m = arr.length;
        int n = arr[0].length;

        int[][] prefix = new int[m][n];
        for(int i=0 ;i<m ; i++){
            for(int j=0 ; j<n ; j++){
                prefix[i][j] = arr[i][j];
                if(i>0) prefix[i][j] += prefix[i-1][j];
                if(j>0) prefix[i][j] += prefix[i][j-1];
                if(i>0 && j>0) prefix[i][j] -= prefix[i-1][j-1];
            }
        }
        for(int i =0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(prefix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
