public class CycleSort {
    public static void swap(int i,int j ,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public  static void print(int[] arr){
        for(int ele : arr) System.out.print(ele+" ");
        System.out.println();
    }
    public static void main(String[] args) {
          int[] arr = {3,4,1,0,5,2};
          int n = arr.length;
          int i=0;
          print(arr);
          while(i<n){
              if(arr[i]==i || arr[i]==n) i++;
              else{
                  swap(i,arr[i],arr);
              }
          }
          print(arr);
    }
}
