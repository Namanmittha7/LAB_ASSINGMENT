
package Array_operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // DECLARATION 
        int[] arr = new int[10];
        
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};


        // Traversal a Array by LOOP
        for (int i = 0; i < arr.length; i++) { 
            // i -> indices of Array
            // [i] -> Access the value at current indices
            System.out.print(arr[i]);
        }

        // Insertion
        // 1 -> Self insert a Element
        arr[0] = 5;
        arr[1] = 8;
        arr[2] = 9;


        // 2 -> By Loop & Using Scanner Class for user input
        Scanner sc = new Scanner(System.in); // Scanner class
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = sc.nextInt(); // taking a integer value at particular index
        }


        // Deletion 

        deleteElementInArray(arr,arr.length,2);
        /*
        The method deleteElementInArray() take three Arguments
        1 - The Array which we want to delete a element
        2 - The size of an array
        3 - The position of a element in Array which wnat to delete
         */

        // Serching in Array
        // 1 -> Liner Search {Time Complexity - O(N)}
        boolean found = false;
        int Element_To_Find = 3;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == Element_To_Find){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element exist in Array");
        } else {
            System.out.println("Element  not exist in Array");
        }

        // 2 -> Binary Serch {For SORTED ARRAY ONLY } 
        int si = 0;
        int ei = arr.length-1;
        int target = 5;

        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(arr[mid] == target){
                System.out.println("Element found at index :- " + mid);
                break;
            } else if (arr[mid] < target) {
                si = mid + 1;
            } else {
                ei = mid-1;
            }
        }
        // if element not fount
        System.out.println("Element not found in given Array");

        // Updation (Modification)
        // 1-> update at given index
        update(arr,4,45);
        /*
        The update method take a three arguments
        1-> The Array which we want to update
        2-> The index which we want to update
        3-> The value which update with the existing  value
        Example -> arr = [1,2,3,4,5]
        update at 3 index value with 55
        update(arr,3,55)
        after the Array look like -> [1,2,3,55,5]
         */

    }

    static int deleteElementInArray(int[] arr,int size,int pos){ // TC - O(N)
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position!");
            return size;
        }
        // Shift elements to left from position
        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return size - 1; // New size of array
    }

    static void update(int[] arr,int index,int val){
        arr[index] = val;
    }
}
