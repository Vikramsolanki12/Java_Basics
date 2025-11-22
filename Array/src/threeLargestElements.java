import java.util.Arrays;

public class threeLargestElements {
    public static void main(String[] args) {
        int[] arr = {2,6,1,12,56,34,78,58,32,89};
//        Arrays.sort(arr);
//
//        int i = arr.length-1;
//        int count =0;
//        while(count<3){
//            System.out.print(arr[i]+" ");
//            i--;
//            count++;
//        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ;i++){
            if(arr[i]>max){
                tmax=smax;
                smax = max;
                max = arr[i];
            }else if(arr[i]>smax && arr[i] != max){
                tmax=smax;
                smax = arr[i];
            }else if(arr[i]>tmax && arr[i] != smax && arr[i] != tmax){
                tmax = arr[i];
            }
        }
        System.out.println(max+" "+smax+" "+tmax);
    }
}
