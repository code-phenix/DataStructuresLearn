// Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
// Example: 
// First Pass: 
// ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1. 
// ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4 
// ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2 
// ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
// Second Pass: 
// ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ) 
// ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2 
// ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
// ( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 ) 
// Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
// Third Pass: 
// ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
// ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
// ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
// ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
class BubbleSort {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sort(int arr[]){
        int size=arr.length;
        for(int iterI=0;iterI<size;iterI++){
            boolean isSwaped=true;
            for(int iterJ=0;iterJ<size-iterI-1;iterJ++){
                if(arr[iterJ]>arr[iterJ+1]){
                    swap(arr,iterJ,iterJ+1);
                    isSwaped=false;
                }
            }
            if(isSwaped)
                break;
        }
    }
    public static void print(int arr[]){
        for(int i:arr)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,2,5,3,5,7};
        sort(arr);
        print(arr);
    }
}
