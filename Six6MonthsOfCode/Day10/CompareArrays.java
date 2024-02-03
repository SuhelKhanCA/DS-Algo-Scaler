package Six6MonthsOfCode.Day10;
import java.util.Arrays;
public class CompareArrays { // Comapring two arrays are Equal using Arrays.deepEqual() method
    public static void main(String[] args) {
        int intArr1[][] = {{10, 20, 66, 55,}}; // input an array
        int intArr2[][] = {{10, 20, 66, 55,}}; // input another array

          // To compare both arrays
          System.out.println("Are Arrays equal ? : " + Arrays.deepEquals(intArr1, intArr2));  
        
    }
}
