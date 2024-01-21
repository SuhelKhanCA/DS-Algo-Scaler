package Lec12;

// import java.util.Scanner;

// public class DeletionArray {
//    // private static final int NULL = 0;
//     static int a[]; // An integer array with default capacity 100
//     int size  = 0; // The number of items present
//     public void create(int size){ // initialize the array == static
//         if (size > 100) {
//             System.out.println("Could not initialize array.");
//             // return 0;
//         }
//         this.size = size;
//         Scanner in = new Scanner(System.in); // To read from keyboard
//         for (int i = 0; i < size; i++) { // reading the elements
//             a[i] = in.nextInt();
//         }
//         System.out.println("Capacity = " + a.length + " -- Size = "+ size);
//         System.out.println(a);
//         // return 0;
//         in.close();
//     }
//     public void delete(int loc){ // Deletion of the elements at the loc position
//         if (size ==0) {
//             System.out.println("Array is underflow : No item to delete");
//         }
//         if (loc < 0 || loc> size) {
//             System.out.println("Out of range : Deletion failed.");
//         }
//         // int item = a[loc]; // The item at loc
//         for (int i = loc; i < size; i++) {
//             a[i] = a[i+1]; // shift to left one place
//         }
//         a[size] = 0;
//         size--;

//         System.out.println("Capacity = " + a.length + " -- Size = "+ size);
//         System.out.println(a);
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in); // To read from keyboard
//         DeletionArray obj1 = new DeletionArray();

//         System.out.print("Enter the number of elements: ");
//         int n = in.nextInt();
//         obj1.create(n);

//         System.out.print("Enter the postion from number to be deleted: ");
//         int pos = in.nextInt();
//         obj1.delete(pos);

//         System.out.print("After deletion: ");
//         System.out.println(a);
//     }
// }
// Java program to implement delete
// operation in an unsorted array

class DeletionArray {
	// function to search a key to
	// be deleted
	static int findElement(int arr[], int n, int key)
	{
		int i;
		for (i = 0; i < n; i++)
			if (arr[i] == key)
				return i;

		return -1;
	}

	// Function to delete an element
	static int deleteElement(int arr[], int n, int key)
	{
		// Find position of element to be
		// deleted
		int pos = findElement(arr, n, key);

		if (pos == -1) {
			System.out.println("Element not found");
			return n;
		}

		// Deleting element
		int i;
		for (i = pos; i < n - 1; i++)
			arr[i] = arr[i + 1];

		return n - 1;
	}

	// Driver's Code
	public static void main(String args[])
	{
		int i;
		int arr[] = { 10, 50, 30, 40, 20 };

		int n = arr.length;
		int key = 30;

		System.out.println("Array before deletion");
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		// Function call
		n = deleteElement(arr, n, key);

		System.out.println("\n\nArray after deletion");
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
