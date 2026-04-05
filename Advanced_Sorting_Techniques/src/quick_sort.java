public class quick_sort {
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int partition(int[] arr,int low ,int high){
        int pivot = arr[low];
        int pIdx = low;

        int smallerCount=0;
        for(int i=low+1;i<=high;i++){
            if(arr[i]<=pivot) smallerCount++;
        }

        int correctIdx = pIdx+smallerCount;

        swap(arr,pIdx,correctIdx);

        int i=low,j=high;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot) swap(arr,i,j);
        }
        return correctIdx;
    }
    public static void QuickSort(int[] arr,int low,int high){
        if(low>=high) return;
        int idx = partition(arr,low,high);

        QuickSort(arr,low ,idx-1);
        QuickSort(arr,idx+1,high);
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {80,10,70,30,60,40,50,20};
        int n = arr.length;
        print(arr);
        QuickSort(arr,0,n-1);
        print(arr);
    }
}
