public class PrintNumbers {
    public static void printNumbers(int n) {
        if (n > 0) {
            System.out.println(n);
            printNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        // Call the printNumbers() function to print 10 to 1.
        printNumbers(10);
    }
}
