package Six6MonthsOfCode.Day9;
import java.util.Arrays;
public class CopyOfArrays {
    public static void main(String[] args) { // Copying an array by the copyOf(arr[], size)
        int intArr[] = {10, 22, 33, 50}; // an input array

        // To print the elements in one line
        System.out.println("Integer Arrays : " + Arrays.toString(intArr));
        System.out.print("\nNew arrays by Copy:\n");
        System.out.println("Integer Arrays: " + Arrays.toString(Arrays.copyOf(intArr, 10)));
    }
}
