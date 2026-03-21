public class MergeTwoSortedArrays {
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
        int[] a = {12,45,78,90};
        int[] b = {10,30,50,80,100};
        int[] c = new int[a.length+b.length];
        print(a);
        print(b);
        merge(a,b,c);
        print(c);
    }
}
