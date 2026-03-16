public class inversion_counts {
    public static int count;
    public static void Inversions(int[] a, int[] b){
        int i=0 , j=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count += a.length-i;
                j++;
            }else{
                i++;
            }
        }
    }
    public static void MergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;

        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for(int i=0 ; i<n/2 ; i++) a[i]=arr[i];
        for(int i=0 ;i<n-n/2 ; i++) b[i] = arr[i+n/2];

        MergeSort(a);
        MergeSort(b);
        Inversions(a,b);
        merge(a,b,arr);
    }
    public static void merge(int[] a, int[] b,int[] c){
        int i=0 , j=0 , k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
            }else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(i==a.length){
            while(j<b.length) c[k++]=b[j++];
        }
        if(j==b.length){
            while(i<a.length) c[k++]=a[i++];
        }
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        int[] arr = {80,10,70,30,60,40,50,20};
        int[] arr = {8,4,2,1};
        count =0;
        print(arr);
        MergeSort(arr);
        print(arr);
        System.out.println(count);
    }
}
