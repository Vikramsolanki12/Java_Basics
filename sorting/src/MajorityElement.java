import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1,2,2,1,2};
        int n = arr.length;
        for( int ele : arr){
            System.out.print(ele+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println(arr[n/2]);
    }
}
