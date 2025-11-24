public class firstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,6,5,8,3,12,6,4,9,1};

        int ans =0;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                ans = arr[i]^arr[j];
                break;
            }
        }
        System.out.println(ans);
    }
}
