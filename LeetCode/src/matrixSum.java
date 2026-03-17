import java.util.ArrayList;
import java.util.Arrays;

public class matrixSum {
    public static void main(String[] args) {
        int[][] matrix = {{0,0,1},{1,1,1},{1,0,1}};
        int m = matrix.length;
        int n = matrix[0].length;
        int ans =0 ;
        for(int i =0 ;i< matrix.length;i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0 ;i<m ;i++){
            for(int j=0 ; j<n ;j++){
                if(matrix[i][j] != 0 && i>0){
                    matrix[i][j] += matrix[i-1][j];
                }
            }
            int[] row = matrix[i].clone();
            Arrays.sort(row);
            for(int j=0 ; j<n ; j++){
                int base = n-j;
                int height = row[j];
                ans = Math.max(ans,base*height);
            }
        }
        System.out.println(ans);
    }
}
