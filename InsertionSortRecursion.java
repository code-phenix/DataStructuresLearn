public class InsertionSortRecursion {
    public static void main(String[] args) {
        int arr[]=new int[]{8,1,3,7,6,5,2};
        sort(arr,1,arr.length);
        print(arr);
    }

    private static void print(int[] arr) {
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void sort(int[] arr,int start,int size) {
        if(start>=size)
            return;
        int j=start-1,key=arr[start];
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
        sort(arr,start+1,size);
    }
}
