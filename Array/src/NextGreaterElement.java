public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {6,5,4,9,2,1};
        int n = arr.length;

        int[] ans = new int[n];
        ans[n-1]=-1;

        int nge = arr[n-1];
        for(int i = n-2 ; i>=0 ;i--){
            ans[i]=nge;
            nge = Math.max(nge,arr[i+1]);
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
