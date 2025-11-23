import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class findDuplicates {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2,12,56,4,8,8,9,10,23,13};

        Arrays.sort(arr);
        for(int i=1 ; i<arr.length ; i++){
            if (arr[i] == arr[i-1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
