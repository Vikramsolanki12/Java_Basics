public class secondMaxElementOnePass {
    public static void main(String[] args) {
        int[] arr = {3,6,9,340,12,56,450,19};

        int i=0;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        while(i<arr.length){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }else if(arr[i]>smax && arr[i] != max){
                smax=arr[i];
            }
            i++;
        }
        System.out.println("max element is:"+max);
        System.out.println("second max element is:"+smax);
    }
}
