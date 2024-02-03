package Six6MonthsOfCode.Day12;
import java.util.Scanner;
public class MagicNumber { // to check whether given three numbers are magic numbers.
    // method for calculating sum of 3 numbers
    public static int sumNum(int n1, int n2, int n3){
        return (n1 + n2 + n3);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Three numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int isMagic = 0;
        int sum = sumNum(num1, num2, num3); // 155/10 ==>>15    // 155%10 ==>> 5
        while (sum != 0) { // 155
            int r = sum % 10;
            sum = sum / 10;
            isMagic = isMagic + r;
        }
        if (isMagic == 1) {
            System.out.println("Given three numbers are magic numbers !");
        } else {
            System.out.println("Opps ! Given numbers are not magic numbers.");
        }
    }
}
