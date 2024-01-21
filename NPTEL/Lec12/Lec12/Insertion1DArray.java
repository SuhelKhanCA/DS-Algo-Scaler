package Lec12;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion1DArray {
    int[] a = new int[100]; // An integer with default 100 capacity
    int size = 0; // the number of the items present 
    public void create(int size){ // static
        if(size > 100){
            System.out.println("Could not initiallize..");
            // return 0;
            // break;
        }
        this.size = size;
        Scanner in = new Scanner(System.in); // to read from keyboard
        System.out.print("Enter the elements:");
        for (int i = 0; i < size; i++) {
            
            a[i] = in.nextInt(); //load the ith entry
        }
        System.out.println("Capacity = " + a.length + " -- Size = "+ size);
        // System.out.println(Arrays.toString(a)); // display the array on the screen
        System.out.println("Array before insertion is : ");
        for(int i = 0; i <size; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();

    }

    public  void insert(int loc){ // insertion at the location of the array === static
        if(size == a.length){
            System.out.println("Insertion is overflow : failed to insert..");
            // return 0;
        }
        if (loc < 0 || loc > size) {
            System.out.println("Out of range: Inertion fails..");
            // return 0;
        }
        Scanner in = new Scanner(System.in); // to read from the keyboard
        System.out.println("Enter the item to be inserted: ");
        int item = in.nextInt();
        for(int i = size; i >= loc; i--){
            // int tmp = a[i];
            // a[i+1] = tmp; // shift right
            a[i+1] = a[i];
        }
        a[loc] = item;
        size++;
        System.out.println("Capacity = "+ a.length + " -- Size = "+size);
        // System.out.println(Arrays.toString(a)); // Display the elements after insertion
        for(int i = 0; i < size; i++){
            System.out.print(a[i] + " ");
        }
        in.close();
    }
// main method
    public static void main(String[] args) {
        Insertion1DArray obj1 = new Insertion1DArray();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();
        obj1.create(size);

        // call for insertion
        System.out.print("Enter the location at which elements to be inserted: ");
        int loc = in.nextInt();
        obj1.insert(loc);
        in.close();
    }

// /*  /*
//      * /*package whatever //do not write package name here */
// //import java.io.*;
 
// // Java Program to Insert an element
// // at a specific position in an Array
// class GFG {
//     static void insertElement(int arr[], int n, int x,
//                               int pos)
//     {
//         // shift elements to the right
//         // which are on the right side of pos
//         for (int i = n - 1; i >= pos; i--)
//             arr[i + 1] = arr[i];
//         arr[pos] = x;
//     }
//     public static void main(String[] args)
//     {
//         int arr[] = new int[15];
//         arr[0] = 2;
//         arr[1] = 4;
//         arr[2] = 1;
//         arr[3] = 8;
//         arr[4] = 5;
//         int n = 5;
//         int x = 10, pos = 2;
 
//         System.out.print("Before Insertion: ");
//         for (int i = 0; i < n; i++)
//             System.out.print(arr[i] + " ");
 
//         // Inserting key at specific position
//         insertElement(arr, n, x, pos);
//         n += 1;
 
//         System.out.print("\n\nAfter Insertion: ");
//         for (int i = 0; i < n; i++)
//             System.out.print(arr[i] + " ");
//     }
// }*/ */ */ */

}