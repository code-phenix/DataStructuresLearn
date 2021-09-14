// Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
// Algorithm 
// To sort an array of size n in ascending order: 
// 1: Iterate from arr[1] to arr[n] over the array. 
// 2: Compare the current element (key) to its predecessor. 
// 3: If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.
// Example: 
 

// insertion-sort

// Another Example: 
// 12, 11, 13, 5, 6
// Let us loop for i = 1 (second element of the array) to 4 (last element of the array)
// i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12 
// 11, 12, 13, 5, 6
// i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13 
// 11, 12, 13, 5, 6
// i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position. 
// 5, 11, 12, 13, 6
// i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position. 
// 5, 6, 11, 12, 13 
 
public class InsertioSort {
    public static void main(String[] args) {
        int arr[]=new int[]{8,1,3,7,6,5,2};
        sort(arr);
        print(arr);
    }
    public static void print(int arr[]){
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(int arr[]){
        int size=arr.length,iterJ;
        for(int iterI=1;iterI<size;iterI++){
                int key=arr[iterI];
                iterJ=iterI-1;
                while(iterJ>=0 && arr[iterJ]>key){
                    arr[iterJ+1]=arr[iterJ];
                    iterJ--;
                }
                arr[iterJ+1]=key;
        }
    }
}


//  Time:-O(n^2)
//space:-O(1)