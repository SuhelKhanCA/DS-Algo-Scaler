/*Reversing a 1D array using recursive method ====>>> Generic program */
package Lec12;
public class Reversing1DArrayRecursive<T>{
    private T[] x; // x is an array of generic type T
    private int size; // size of the array

    // Constructor
    public Reversing1DArrayRecursive(T[] t){
        x = t;
        size = t.length;
    }

    // public Reversing1DArrayRecursive(int i, int j, int k, int l) {
    //     //TODO Auto-generated constructor stub
    // }

    // A recursive method to reverse the ordering of array x
    public void reverse1D(int length){
        if(length > 1){ // Termination condition check
            // swap the elements
            T temp;
            temp = x[size - length];
            x[size - length] = x[length-1];
            x[length -1] = temp;
            reverse1D(length - 1);
        }
    }
}  // This complete the definition of the generic class

