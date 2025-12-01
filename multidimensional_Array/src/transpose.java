public class transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6}};
        int m = arr.length;
        int n = arr[0].length;

        int[][] trans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trans[i][j]=arr[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
