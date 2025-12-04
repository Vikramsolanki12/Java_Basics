public class additionOfMatricesWithoutUsingExtraArray {
    public static void main(String[] args) {
        int[][] arr1= {{8,12,16},{8,4,2},{6,9,15}};
        int[][] arr2 = {{1,6,11},{7,4,12},{8,15,9}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
