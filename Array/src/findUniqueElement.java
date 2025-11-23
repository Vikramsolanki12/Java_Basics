import java.util.Arrays;

public class findUniqueElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,3,4,5,6,6,8,9,8,9};

        int unique=0;
        for(int num : arr){
            unique ^= num;
        }
        System.out.println(unique);
    }
}
