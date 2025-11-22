public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,5,7,-1,8,12,11,9};
        int x = 20;

        for(int i = 0 ; i < arr.length ;i++){
            for(int j = i ; j < arr.length ; j++){
                if(arr[j] == (x-arr[i])) System.out.println(i +" "+j);
            }
        }
    }
}
