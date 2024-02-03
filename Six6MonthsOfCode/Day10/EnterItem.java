package Six6MonthsOfCode.Day10;
import java.util.Arrays;
public class EnterItem {
    public static void main(String[] args) {
        // get an arrays
        int intArr[] = {10, 20, 50, 22, 78};
        int intKey = 411;
        System.out.println("Array before filling : " + Arrays.toString(intArr));
        // filling an array with a particular key elements
        Arrays.fill(intArr, intKey);
        System.out.println("Integer array after filling" + Arrays.toString(intArr));
    }
}
