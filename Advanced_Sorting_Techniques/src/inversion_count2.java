import java.util.Scanner;

public class inversion_count2 {
    public static int count;
    public static void MergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;

        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        for(int i=0 ; i<n/2 ; i++) a[i]=arr[i];
        for(int i=0 ;i<n-n/2 ; i++) b[i] = arr[i+n/2];

        MergeSort(a);
        MergeSort(b);
        merge(a,b,arr);
    }
    public static void merge(int[] a, int[] b,int[] c){
        int i=0 , j=0 , k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else{
                count += a.length-i;
                c[k++]=b[j++];
            }
        }
        if(i==a.length){
            while(j<b.length) c[k++]=b[j++];
        }
        if(j==b.length){
            while(i<a.length) c[k++]=a[i++];
        }
    }
    public static void main (String[] args)
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) arr[i]=scn.nextInt();

        count =0;
        MergeSort(arr);
        System.out.print(count);
    }
}
