// The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
// 1) The subarray which is already sorted. 
// 2) Remaining subarray which is unsorted.
// In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. 
// Following example explains the above steps: 
 

 
 

// arr[] = 64 25 12 22 11

// // Find the minimum element in arr[0...4]
// // and place it at beginning
// 11 25 12 22 64

// // Find the minimum element in arr[1...4]
// // and place it at beginning of arr[1...4]
// 11 12 25 22 64

// // Find the minimum element in arr[2...4]
// // and place it at beginning of arr[2...4]
// 11 12 22 25 64

// // Find the minimum element in arr[3...4]
// // and place it at beginning of arr[3...4]
// 11 12 22 25 64

class SelectionSort{
    public static void swap(int arr[],int index,int j){
        arr[index]=arr[index]+arr[j];
        arr[j]=arr[index]-arr[j];
        arr[index]=arr[index]-arr[j];
    }
    public static void sort(int arr[]){
        int size=arr.length;
        for(int i=0;i<size;i++){
            int index=i;
            for(int j=i+1;j<size;j++){
                if(arr[index]>arr[j])
                    index=j;
            }
            if(index!=i)
                swap(arr,index,i);
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
    // Time Complexity: O(n2) as there are two nested loops.
    // Auxiliary Space: O(1) 
}