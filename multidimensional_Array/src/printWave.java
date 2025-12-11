public class printWave {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length , n=arr[0].length;

        int j=0;
        while(j<n){
            if(j%2==0){
                for(int i=0 ; i<m ; i++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int i=m-1 ; i>=0 ; i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            j++;
        }
    }
}
