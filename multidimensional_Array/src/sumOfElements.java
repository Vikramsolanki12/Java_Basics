public class sumOfElements {
    public static void main(String[] args) {
        int[][] arr = {{4,12,67,32},{1,7,2,90},{34,12,11,8},{1,1,0,23}};

        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum of all the elements is:"+sum);
    }
}
