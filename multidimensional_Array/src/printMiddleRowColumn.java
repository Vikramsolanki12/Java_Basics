public class printMiddleRowColumn {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{3,4,5,6,7},{7,6,5,4,3},{8,7,6,5,4},{1,2,37,8,0}};

        for(int i=0 ; i<arr.length ; i++){
            for(int j =0 ; j<arr[0].length ; j++){
                if(arr.length/2==i || arr[0].length/2==j){
                    System.out.print(arr[i][j]+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
