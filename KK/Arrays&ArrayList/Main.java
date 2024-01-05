import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       fun(); 
    }

    
    /* General Syntax(can store only same type of datas)

     * datatype[] var_name = new datatype[size];
     array is not alaways continuous allocation in the memory in JAVA
     */
      //  null is special literal**** can't be assigned to primitives
//by defeault value of any variable   /// can be asssigned to Non primitives
     
      // To do something

 static   void fun(){
     int[] arr ={23, 577, 89};
     
    //  for (int i = 0; i<3; i++) {
    //     arr[i] = sc.nextInt();
    //  }
     System.out.println(Arrays.toString(arr));
 }
    

    // String str  = null;

    // int nl =(Integer)null;

/*
 * for(int num: arr) // for every element in arr
 * 
 * Arrays.toString(arr)  -- method for printing the arrays
 */


}
