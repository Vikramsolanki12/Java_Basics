public class spiralPrinting {
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m = arr.length;
        int n = arr[0].length;

        printArray(arr);

        int minR=0, maxR=m-1,minC=0,maxC=n-1;

        while(minR<=maxR && minC<=maxC){
            for(int j=minC ; j<=maxC ;j++){
                System.out.print(arr[minR][j]+" ");
            }
            minR++;

            if(minR>maxR || minC>maxC) break;

            for(int i=minR ;i<=maxR ; i++){
                System.out.print(arr[i][maxC]+" ");
            }
            maxC--;

            if(minR>maxR || minC>maxC) break;

            for(int j=maxC ; j>=minC ;j--){
                System.out.print(arr[maxR][j]+" ");
            }
            maxR--;

            if(minR>maxR || minC>maxC) break;

            for(int i=maxR ;i>=minR ; i--){
                System.out.print(arr[i][minC]+" ");
            }
            minC++;
        }
    }
}
