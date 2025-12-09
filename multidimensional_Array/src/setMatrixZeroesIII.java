public class setMatrixZeroesIII {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,0,21},{3,0,24,21,9},{6,10,7,0,-9},{0,4,19,3,99}};
        int m = arr.length;
        int n = arr[0].length;

        boolean zeroRows= false;
        boolean zeroCols = false;

        for(int j=0 ; j<n ; j++){
            if(arr[0][j]==0){
                zeroRows= true;
                break;
            }
        }
        for(int i=0 ; i<n ; i++){
            if(arr[i][0]==0){
                zeroCols= true;
                break;
            }
        }
        for(int i=1 ; i<m ; i++){
            for(int j=1 ; j<n ;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        for(int j=1 ; j<n ; j++){
            if(arr[0][j]==0){
                for(int i=0 ; i<m ; i++){
                    arr[i][j]=0;
                }
            }
        }
        for(int i=1 ; i<m ; i++){
            if(arr[i][0]==0){
                for(int j=0 ; j<n ; j++){
                    arr[i][j]=0;
                }
            }
        }
        if(zeroRows==true){
            for(int j =0 ;j<n ; j++){
                arr[0][j]=0;
            }
        }
        if(zeroCols==true){
            for(int i =0 ;i<m ; i++){
                arr[i][0]=0;
            }
        }

        for(int i=1 ; i<m ; i++){
            for(int j=1 ; j<n ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
