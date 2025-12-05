public class additionOfMatrices {
    public static void main(String[] args) {
        int[][] arr1= {{8,12,16},{8,4,2},{6,9,15}};
        int[][] arr2 = {{1,6,11},{7,4,12},{8,15,9}};

        if(arr1.length == arr2.length && arr1[0].length == arr2[0].length){
            int[][] ans = new int[arr1.length][arr1[0].length];

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    ans[i][j] = arr1[i][j]+arr2[i][j];
                }
            }

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("can't add such matrices....");
        }
    }
}
