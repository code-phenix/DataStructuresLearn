// Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
// Example: 
// First Pass: 
// ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1. 
// ( 1 5 4 2 8 ) –> ( 1 4 5 2 8 ), Swap since 5 > 4 
// ( 1 4 5 2 8 ) –> ( 1 4 2 5 8 ), Swap since 5 > 2 
// ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
// Second Pass: 
// ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ) 
// ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2 
// ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
// ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
// Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
// Third Pass: 
// ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
// ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
// ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
// ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
public class BubbleSortRecursive {
    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
  public static void sortRecursion(int arr[],int n) {
      for(int iterI=0;iterI<n-1;iterI++){
          if(arr[iterI]>arr[iterI+1]){
                swap(arr,iterI,iterI+1);
          }
          sortRecursion(arr, n-1);
      }
        
    }
    private static void swap(int[] arr, int iterI, int iterJ) {
        int temp=arr[iterI];
        arr[iterI]=arr[iterJ];
        arr[iterJ]=temp;
}
    public static void main(String[] args) {
        int arr[]=new int[]{4,4,0,20,2,3,4,1,3,4};
        sortRecursion(arr,arr.length);
        print(arr);
    }
    
    
}
